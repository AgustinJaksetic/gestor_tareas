package com.pium.Test;

import com.pium.object.Tasks;
import com.pium.object.enums.Estado;
import com.pium.repository.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MockTaskDao implements Repository {
    HashMap<Integer, Tasks> tareas = new HashMap<>();


    @Override
    public Tasks getTarea(Integer id) {
        return tareas.get(id);
    }

    @Override
    public void queryTareas(Tasks tarea) {
        tareas.put(tarea.getId(), tarea);
    }

    @Override
    public HashMap<Integer, Tasks> getTareas() {
        return tareas;
    }

    @Override
    public Map<Integer, Tasks> getTareasCompletadas() {
        return tareas.entrySet().stream()
                .filter(entry -> entry.getValue().getEstado() == Estado.FINALIZADA)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public void deleteTask(int id) {
    }

    @Override
    public boolean existTask(Integer id) {
        return true;
    }
}
