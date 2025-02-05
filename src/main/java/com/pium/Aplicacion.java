package com.pium;

import com.pium.builder.Tareas;
import com.pium.service.TareasService;

import java.util.HashMap;

public class Aplicacion {
    public Aplicacion() {
        TareasService.crearTarea();
        TareasService.crearTarea();

        HashMap<Integer, Tareas> listas;

        listas = TareasService.listatareasCompletas();

        listas.get(1).setDescripcion("Descripcion actualizada");

        System.out.println(listas);

    }
}