package com.pium.repository;

import com.pium.builder.Tareas;

import java.util.HashMap;
import java.util.Map;

public interface Repository {
    Tareas getTarea(Integer id);
    void queryTareas(Tareas tarea);
    HashMap<Integer, Tareas> getTareas();
    Map<Integer, Tareas> getTareasCompletadas();
}
