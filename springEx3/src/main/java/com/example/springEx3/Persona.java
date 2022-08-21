package com.example.springEx3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer anioNac;

    public Persona() {}

    public Persona(Long id, String nombre, String apellido, Integer anioNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNac = anioNac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(Integer anioNac) {
        this.anioNac = anioNac;
    }
}
