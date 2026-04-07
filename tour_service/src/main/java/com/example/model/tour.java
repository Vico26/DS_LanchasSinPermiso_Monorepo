package com.example.model;

import jakarta.persistence.*;

@Entity
public class Tour {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String ubicacion;
    private double precio;

    public Tour() {}

    public Tour(String nombre, String ubicacion, double precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public double getPrecio() { return precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setPrecio(double precio) { this.precio = precio; }
}