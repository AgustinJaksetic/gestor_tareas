package com.pium.object;

import com.pium.object.enums.Estado;
import com.pium.object.enums.Prioridad;

import java.util.List;

public class TasksBuilder {
    private int id;
    private String titulo;
    private String descripcion;
    private Estado estado = Estado.SIN_EMPEZAR;
    private Prioridad prioridad;
    private List<Activities> actividades;

    public String getDescripcion() {
        return descripcion;
    }

    public TasksBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public List<Activities> getActividades() {
        return actividades;
    }

    public TasksBuilder setActividades(List<Activities> actividades) {
        this.actividades = actividades;
       return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public TasksBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public TasksBuilder setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public TasksBuilder setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
        return this;
    }

    public int getId() {
        return id;
    }

    public TasksBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Tasks build() {
        return new Tasks(this);
    }
}
