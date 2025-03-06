package com.pium.logic.builder;

import com.pium.object.Activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildActivitie {

    static List<Activities> activitiesCreate(Scanner input){
        List<Activities> lista = new ArrayList<>();
        System.out.println("Crear una actividad");
        int a = 1;
        do {
            lista.add(new Activities("Actividad "+ a, "Descripcion " + a, a++));
            System.out.println("Crear otra actividad?");

        } while (!input.nextLine().equalsIgnoreCase("no"));

        return lista;
    }
}
