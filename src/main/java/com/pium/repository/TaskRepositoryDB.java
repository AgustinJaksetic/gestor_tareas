package com.pium.repository;
import com.pium.object.Tasks;
import java.util.HashMap;

public class TaskRepositoryDB {
    /*
    En TareasDB es donde tenemos nuestra construcción de la base de datos
    donde creamos las tablas con sus registros y campos, (en este caso usamos un hashmap como sustituto).
     */
    static HashMap<Integer, Tasks> db_tareas = new HashMap<>(); //Nuestra "Base de datos"

    public static int generateId(){ //Generamos una primary key(id) para identificar cada registro almacenado.
        int id = 1;

        if (!db_tareas.isEmpty()) {
            id = db_tareas.keySet()  //Agarramos las key
                    .stream()  // iniciamos un stream con las key
                    .mapToInt(Integer::intValue)  // las pasamos de integer a int
                    .max()  // buscamos el valor máximo de las key
                    .orElse(0) + 1;  // si no encontramos ninguna la inicializamos en 1 si encuentra 1 le suma 1;
        }
        return id;

    }
}
