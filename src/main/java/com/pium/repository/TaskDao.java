package com.pium.repository;
import com.pium.builder.Tasks;
import com.pium.builder.enums.Estado;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class TaskDao implements Repository {

    /*
        TareasDao se encarga de hacer todas las consultas a nuestra
        Base de datos ( en este caso usamos un hashmap como base de datos ).
     */
    @Override
    public Tasks getTarea(Integer id) { //Se encarga de hacer una consulta para obtener un objeto Tareas.
        return TaskRepositoryDB.db_tareas.get(id);
    }

    @Override
    public void queryTareas(Tasks tarea) { //Se encarga de hacer una consulta para insertar un objeto Tareas en la base de datos.
        TaskRepositoryDB.db_tareas.put(tarea.getId(), tarea);
    }

    @Override
    public HashMap<Integer, Tasks> getTareas() { //Se encarga de hacer una consulta para obtener todas las tareas de la base de datos.
        return TaskRepositoryDB.db_tareas;
    }

    @Override
    public Map<Integer, Tasks> getTareasCompletadas() { //Se encarga de hacer una consulta para obtener todas las tareas completadas de la base de datos
        return TaskRepositoryDB.db_tareas.entrySet().stream()
                .filter(entry -> entry.getValue().getEstado() == Estado.FINALIZADA)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
