package com.pium.Test;

import com.pium.builder.Tareas;
import com.pium.builder.enums.Estado;
import com.pium.repository.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MockTareaDao implements Repository {
    HashMap<Integer, Tareas> tareas = new HashMap<>();


    @Override
    public Tareas getTarea(Integer id) {
        return tareas.get(id);
    }

    @Override
    public void queryTareas(Tareas tarea) {
        tareas.put(tarea.getId(), tarea);
    }

    @Override
    public HashMap<Integer, Tareas> getTareas() {
        return tareas;
    }

    @Override
    public Map<Integer, Tareas> getTareasCompletadas() {
        return tareas.entrySet().stream()
                .filter(entry -> entry.getValue().getEstado() == Estado.FINALIZADA)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
