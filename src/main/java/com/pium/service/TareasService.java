package com.pium.service;

import com.pium.builder.Actividades;
import com.pium.builder.Tareas;
import com.pium.builder.TareasBuilder;
import com.pium.builder.enums.Estado;
import com.pium.builder.enums.Prioridad;
import com.pium.repository.Repositorio;
import com.pium.repository.TareasDB;

import java.util.*;

public class TareasService {
    /*
        En TareaService nos encargamos de gestionar la creación de las tareas
        y las validaciones, excepciones básicamente toda la demás lógica de negocio.
     */
    private final Repositorio tareaDao;

    public TareasService(Repositorio tareaDao) { //inyección de dependencias para que si quiero hacer tests en un futuro o cambiar a una base de datos.
        this.tareaDao = tareaDao;
    }

    public void crearTarea(Scanner input){ //Construimos el objeto Tareas con nuestro patron de diseño Builder y lo insertamos en la base de datos.
        List<Actividades> actividades = crearActividades(input);
        tareaDao.queryTareas(
            new TareasBuilder()
                .setTitulo("Tarea 1")
                .setDescripcion("Descripcion 1")
                .setPrioridad(Prioridad.ALTA)
                .setActividades(actividades)
                .setEstado(Estado.FINALIZADA)
                .setId(TareasDB.generateId())
                .build()
        );
    }

    public void tituloUpdate(int id, String titulo){ //Actualizamos el título de la tarea indicada por él id.
        tareaDao.getTarea(id).setTitulo(titulo);
    }

    public void descripcionUpdate(int id, String descripcion){ //Actualizamos la descripcion de la tarea indicada por él id.
        tareaDao.getTarea(id).setDescripcion(descripcion);
    }

    public List<Actividades> crearActividades(Scanner input){
        List<Actividades> lista = new ArrayList<>();
        System.out.println("Crear una actividad");
        int a = 1;
        do {
            lista.add(new Actividades("Actividad "+ a, "Descripcion " + a, a++));
            System.out.println("Crear otra actividad?");

        } while (!input.nextLine().equalsIgnoreCase("no"));

        return lista;
    }

    public HashMap<Integer, Tareas> listaTareas(){
        return tareaDao.getTareas();
    }

    public Map<Integer, Tareas> listatareasCompletas() {
        return tareaDao.getTareasCompletadas();
    }

}