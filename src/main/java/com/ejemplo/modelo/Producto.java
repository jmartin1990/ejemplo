package com.ejemplo.modelo;

public class Producto {
    private String referencia;  // Cambiado de int id a String referencia
    private String nombre;
    private String descripcion;
    private double precio;

    // Constructor por defecto
    public Producto() {}

    // Constructor con todos los parámetros
    public Producto(String referencia, String nombre, String descripcion, double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Constructor sin referencia
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y Setters
    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
