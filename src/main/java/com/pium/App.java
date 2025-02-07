package com.pium;

import com.pium.builder.Tasks;
import com.pium.repository.TaskDao;
import com.pium.repository.Repository;
import com.pium.service.TasksService;

import java.util.Map;
import java.util.Scanner;

public class App {
    public Repository tareaDao = new TaskDao();
    public TasksService tareasService = new TasksService(tareaDao);
    public Scanner scanner = new Scanner(System.in);

    public App() {
        tareasService.crearTarea(scanner);
        tareasService.crearTarea(scanner);

        Map<Integer, Tasks> listas;
        tareasService.tituloUpdate(2, "Titulo Actualizado");
        tareasService.descripcionUpdate(2, "Descripcion Actualizada");

        listas = tareasService.listatareasCompletas();

        tareasService.tituloUpdate(1, "test titulo");

        System.out.println(listas);

    }
}