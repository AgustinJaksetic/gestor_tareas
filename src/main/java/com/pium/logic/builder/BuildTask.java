package com.pium.logic.builder;

import com.pium.object.Activities;
import com.pium.object.Tasks;
import com.pium.object.TasksBuilder;
import com.pium.object.enums.Estado;
import com.pium.object.enums.Prioridad;
import com.pium.repository.TaskRepositoryDB;

import java.util.List;
import java.util.Scanner;

public class BuildTask {


    public static Tasks buildTask(){ //Construimos el objeto Tareas con nuestro patron de diseño Builder y lo insertamos en la base de datos.
        List<Activities> actividades = BuildActivitie.activitiesCreate();
            return new TasksBuilder()
                        .setTitulo("Hacer las compras")
                        .setDescripcion("Llevar paraguas por si llueve")
                        .setPrioridad(Prioridad.ALTA)
                        .setActividades(actividades)
                        .setEstado(Estado.FINALIZADA)
                        .setId(TaskRepositoryDB.generateId())
                        .build();
    }
}
