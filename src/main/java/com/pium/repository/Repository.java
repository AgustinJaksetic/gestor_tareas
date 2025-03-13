package com.pium.repository;

import com.pium.object.Tasks;

import java.util.HashMap;
import java.util.Map;

public interface Repository {
    Tasks getTarea(Integer id);
    void queryTareas(Tasks tarea);
    HashMap<Integer, Tasks> getTareas();
    Map<Integer, Tasks> getTareasCompletadas();
    void deleteTask(int id);
    boolean existTask(Integer id);
}
