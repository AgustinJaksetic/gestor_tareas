package com.pium.service;

import com.pium.builder.Actividades;
import com.pium.builder.Tareas;
import com.pium.builder.TareasBuilder;
import com.pium.builder.enums.Estado;
import com.pium.builder.enums.Prioridad;
import com.pium.repository.TareaDao;
import com.pium.repository.TareasDB;

import java.util.*;
import java.util.stream.Collectors;

public class TareasService {
    public static Scanner Scanner = new Scanner(System.in);
    /*
        En TareaService nos encargamos de gestionar la creación de las tareas
        y las validaciones, excepciones, y toda la demás lógica de negocio.
     */


    public static void crearTarea(){ //Construimos el objeto Tareas con nuestro patron de diseño Builder y lo insertamos en la base de datos.

        TareaDao.queryTareas(
            new TareasBuilder()
                .setTitulo("Tarea 1")
                .setDescripcion("Descripcion 1")
                .setActividades(crearActividades())
                .setPrioridad(Prioridad.ALTA)
                .setEstado(Estado.FINALIZADA)
                .setId(TareasDB.generateId())
                .build()
        );
    }

    public static void tituloUpdate(int id, String titulo){ //Actualizamos el título de la tarea indicada por él id.
        TareaDao.getTarea(id).setTitulo(titulo);
    }

    public static void descripcionUpdate(int id, String descripcion){ //Actualizamos la descripcion de la tarea indicada por él id.
        TareaDao.getTarea(id).setDescripcion(descripcion);
    }

    public static List<Actividades> crearActividades(){
        List<Actividades> lista = new ArrayList<>();
        System.out.println("Crear una actividad");
        int a = 1;
        do {


            lista.add(new Actividades("Actividad "+ a, "Descripcion " + a, a++));
            System.out.println("Crear otra actividad?");

        } while (!Scanner.nextLine().equalsIgnoreCase("no"));

        return lista;
    }

    public static HashMap<Integer, Tareas> listaTareas(){
        return TareaDao.getTareas();
    }

    public static HashMap<Integer, Tareas> listatareasCompletas() {

        return listaTareas().entrySet().stream()

                .filter(entry -> entry.getValue().getEstado() == Estado.FINALIZADA)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k, v) -> k,
                        HashMap::new
                ));
    }
}