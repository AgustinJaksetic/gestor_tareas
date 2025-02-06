package com.pium;

import com.pium.builder.Tareas;
import com.pium.service.TareasService;

import java.util.Map;
import java.util.Scanner;


public class Aplicacion {
    public TareasService tareasService = new TareasService();
    public Scanner scanner = new Scanner(System.in);

    public Aplicacion() {
        tareasService.crearTarea(scanner);
        tareasService.crearTarea(scanner);

        Map<Integer, Tareas> listas;
        tareasService.tituloUpdate(2, "Titulo Actualizado");
        tareasService.descripcionUpdate(2, "Descripcion Actualizada");

        listas = tareasService.listatareasCompletas();

        tareasService.tituloUpdate(1, "test titulo");

        System.out.println(listas);

    }
}