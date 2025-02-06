package com.pium;

import com.pium.builder.Tareas;
import com.pium.service.TareasService;

import java.util.Map;


public class Aplicacion {
    public TareasService tareasService = new TareasService();
    public Aplicacion() {
        tareasService.crearTarea();
        tareasService.crearTarea();

        Map<Integer, Tareas> listas;
        tareasService.tituloUpdate(2, "Titulo Actualizado");
        tareasService.descripcionUpdate(2, "Descripcion Actualizada");

        listas = tareasService.listatareasCompletas();

        tareasService.tituloUpdate(1, "test titulo");

        System.out.println(listas);

    }
}