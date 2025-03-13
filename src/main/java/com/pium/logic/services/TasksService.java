package com.pium.logic.services;

import com.pium.logic.builder.BuildTask;
import com.pium.object.Tasks;
import com.pium.repository.Repository;

import java.util.*;

public class TasksService {
    /*
        En TareaService nos encargamos de gestionar la creación de las tareas
        y las validaciones, excepciones básicamente toda la demás lógica de negocio.
     */
    private final Repository tareaDao;

    public TasksService(Repository tareaDao) { //inyección de dependencias para hacer tests en un futuro o cambiar a una base de datos.
        this.tareaDao = tareaDao;
    }

    public void taskCreate(){
        tareaDao.queryTareas(BuildTask.buildTask());
    }

    public Tasks getTask(int id) {
        if(tareaDao.existTask(id)) return null;
        return tareaDao.getTarea(id);
    }

    public HashMap<Integer, Tasks> getallTasks(){
        HashMap<Integer, Tasks> s = tareaDao.getTareas();
        if(s.isEmpty()) return null;
        return s;
    }

    public Map<Integer, Tasks> getCompletedTasks() {
        Map<Integer, Tasks> s = tareaDao.getTareasCompletadas();
        if(s.isEmpty()) return null;
        return s;
    }

    public boolean deleteTask(int id) {
        if (id != 0) return false;
        if(tareaDao.existTask(id)) return false;
        tareaDao.deleteTask(id);
        return true;
    }

    public boolean titleUpdate(int id, String titulo){ //Actualizamos el título de la tarea indicada por él id.
        if(!tareaDao.existTask(id)) return false;
        tareaDao.getTarea(id).setTitulo(titulo);
        return true;
    }

    public boolean descriptionUpdate(int id, String descripcion){ //Actualizamos la descripcion de la tarea indicada por él id.
        if(!tareaDao.existTask(id)) return false;
        tareaDao.getTarea(id).setDescripcion(descripcion);
        return true;
    }

}