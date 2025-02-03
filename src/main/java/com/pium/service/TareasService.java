package com.pium.service;

import com.pium.builder.Actividades;
import com.pium.builder.TareasBuilder;
import com.pium.builder.enums.Estado;
import com.pium.builder.enums.Prioridad;
import com.pium.repository.TareaDao;
import com.pium.repository.TareasDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                .setEstado(Estado.SIN_EMPEZAR)
                .setId(TareasDB.generateId())
                .build()
        );
    }

    public static void tituloUpdate(int id){ //Actualizamos el título de la tarea indicada por él id.
        TareaDao.getTarea(id).setTitulo(Scanner.nextLine());
    }

    public static void descripcionUpdate(int id){ //Actualizamos la descripcion de la tarea indicada por él id.
        TareaDao.getTarea(id).setDescripcion(Scanner.nextLine());
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
}