package com.pium.repository;
import com.pium.builder.Tareas;

import java.util.HashMap;

public final class TareaDao {

    /*
        TareasDao se encarga de hacer todas las consultas a nuestra
        Base de datos ( en este caso usamos un hashmap como base de datos ).
     */

    public Tareas getTarea(Integer id) { //Se encarga de hacer una consulta para obtener un objeto Tareas.
        return TareasDB.db_tareas.get(id);
    }

    public void queryTareas(Tareas tarea) { //Se encarga de hacer una consulta para insertar un objeto Tareas en la base de datos.
        TareasDB.db_tareas.put(tarea.getId(), tarea);
    }

    public HashMap<Integer, Tareas> getTareas() { //Se encarga de hacer una consulta para obtener todas las tareas de la base de datos.
        return TareasDB.db_tareas;
    }
}
