package com.pium.object;

import com.pium.object.enums.Estado;
import com.pium.object.enums.Prioridad;

import java.util.List;

public class Tasks {

    private final Integer id;
    private String titulo;
    private String descripcion;
    private Estado estado;
    private Prioridad prioridad;
    private final List<Activities> actividades;

    public Tasks(TasksBuilder builder) {
        this.titulo = builder.getTitulo();
        this.descripcion = builder.getDescripcion();
        this.estado = builder.getEstado();
        this.prioridad = builder.getPrioridad();
        this.actividades = builder.getActividades();
        this.id = builder.getId();

    }

    public List<Activities> getActividades() {
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
                ", Actividades=" + mostrarActividades()+ "\n" +
                '}';
    }
}
