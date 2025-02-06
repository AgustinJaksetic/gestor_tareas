package com.pium.repository;
import com.pium.builder.Tareas;
import com.pium.builder.enums.Estado;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class TareaDao implements TareaDaoInterface {

    /*
        TareasDao se encarga de hacer todas las consultas a nuestra
        Base de datos ( en este caso usamos un hashmap como base de datos ).
     */
    @Override
    public Tareas getTarea(Integer id) { //Se encarga de hacer una consulta para obtener un objeto Tareas.
        return TareasDB.db_tareas.get(id);
    }

    @Override
    public void queryTareas(Tareas tarea) { //Se encarga de hacer una consulta para insertar un objeto Tareas en la base de datos.
        TareasDB.db_tareas.put(tarea.getId(), tarea);
    }

    @Override
    public HashMap<Integer, Tareas> getTareas() { //Se encarga de hacer una consulta para obtener todas las tareas de la base de datos.
        return TareasDB.db_tareas;
    }

    @Override
    public Map<Integer, Tareas> getTareasCompletadas() { //Se encarga de hacer una consulta para obtener todas las tareas completadas de la base de datos
        return TareasDB.db_tareas.entrySet().stream()
                .filter(entry -> entry.getValue().getEstado() == Estado.FINALIZADA)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
