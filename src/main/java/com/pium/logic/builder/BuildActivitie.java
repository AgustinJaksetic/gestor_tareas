package com.pium.logic.builder;

import com.pium.object.Activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildActivitie {

    static List<Activities> activitiesCreate(){
        List<Activities> lista = new ArrayList<>();
            lista.add(new Activities("Comprar pan", "En Coto", 1));


        return lista;
    }
}
