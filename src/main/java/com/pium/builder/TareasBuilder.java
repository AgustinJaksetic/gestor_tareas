package com.pium.builder;

import com.pium.builder.enums.Estado;
import com.pium.builder.enums.Prioridad;

import java.util.List;

public class TareasBuilder {
    private int id;
    private String titulo;
    private String descripcion;
    private Estado estado = Estado.SIN_EMPEZAR;
    private Prioridad prioridad;
    private List<Actividades> actividades;

    public String getDescripcion() {
        return descripcion;
    }

    public TareasBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public List<Actividades> getActividades() {
        return actividades;
    }

    public TareasBuilder setActividades(List<Actividades> actividades) {
        this.actividades = actividades;
       return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public TareasBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public TareasBuilder setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public TareasBuilder setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
        return this;
    }

    public int getId() {
        return id;
    }

    public TareasBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Tareas build() {
        return new Tareas(this);
    }
}
