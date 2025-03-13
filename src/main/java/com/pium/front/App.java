package com.pium.front;

import com.pium.logic.services.TasksService;
import com.pium.repository.Repository;
import com.pium.repository.TaskDao;

public class App {
    Repository dao = new TaskDao();
    TasksService service = new TasksService(dao);
    public App(){

    }
}
