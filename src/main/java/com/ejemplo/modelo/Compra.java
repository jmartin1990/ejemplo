package com.ejemplo.modelo;

import java.time.LocalDate;

public class Compra {
    private int id;
    private String nombreCliente;
    private LocalDate fechaCompra;
    private double precioCompra;
    private boolean pagoTarjeta;

    // Constructor por defecto
    public Compra() {}

    // Constructor con todos los parámetros
    public Compra(int id, String nombreCliente, LocalDate fechaCompra, double precioCompra, boolean pagoTarjeta) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.pagoTarjeta = pagoTarjeta;
    }

    // Constructor sin id
    public Compra(String nombreCliente, LocalDate fechaCompra, double precioCompra, boolean pagoTarjeta) {
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.pagoTarjeta = pagoTarjeta;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
    public LocalDate getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(LocalDate fechaCompra) { this.fechaCompra = fechaCompra; }
    public double getPrecioCompra() { return precioCompra; }
    public void setPrecioCompra(double precioCompra) { this.precioCompra = precioCompra; }
    public boolean isPagoTarjeta() { return pagoTarjeta; }
    public void setPagoTarjeta(boolean pagoTarjeta) { this.pagoTarjeta = pagoTarjeta; }
}
