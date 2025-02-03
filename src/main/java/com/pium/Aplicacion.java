package com.pium;

import com.pium.repository.TareaDao;
import com.pium.service.TareasService;


public class Aplicacion {
    public Aplicacion() {

        TareasService.crearTarea();
        TareasService.crearTarea();

        TareaDao.getTareas();

        TareaDao.getTarea(1).setDescripcion("Descripcion actualizada");

        System.out.println(TareaDao.getTarea(1));

    }
}