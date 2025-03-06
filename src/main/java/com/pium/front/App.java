package com.pium.front;

import com.pium.repository.TaskDao;
import com.pium.logic.services.TasksService;

import javax.swing.*;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static TaskDao dao = new TaskDao();
    static TasksService service = new TasksService(dao);
    JFrame frame = new Window();


    public App() {
        service.taskCreate(sc);
        service.descriptionUpdate(1, "Nueva descripcion");
        service.taskCreate(sc);
        frame.setVisible(true);
    }

}