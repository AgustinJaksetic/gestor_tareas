package com.pium.builder;

import com.pium.builder.enums.Estado;
import com.pium.builder.enums.Prioridad;

import java.util.List;

public class Tareas{

    private final Integer id;
    private String titulo;
    private String descripcion;
    private Estado estado;
    private Prioridad prioridad;
    private final List<Actividades> actividades;

    public Tareas(TareasBuilder builder) {
        this.titulo = builder.getTitulo();
        this.descripcion = builder.getDescripcion();
        this.estado = builder.getEstado();
        this.prioridad = builder.getPrioridad();
        this.actividades = builder.getActividades();
        this.id = builder.getId();

    }

    public List<Actividades> getActividades() {
        return actividades;
    }


    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

public String mostrarActividades() {
    StringBuilder sb = new StringBuilder();
    actividades.forEach(actividad -> sb.append(actividad).append(", "));
        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 2); // Eliminar la última coma y espacio
        }
        return sb.toString();
}

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tareas{" +
                "Id= " + id +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", prioridad=" + prioridad +
                ", Actividades=" + mostrarActividades() +
                '}';
    }
}
