package com.ejemplo.modelo;

import java.time.LocalDate;

public class Compra {
    private String codigo;  // Cambiado de int id a String codigo
    private String nombreCliente;
    private LocalDate fechaCompra;
    private double precioCompra;
    private boolean pagoTarjeta;

    // Constructor por defecto
    public Compra() {}

    // Constructor con todos los parámetros
    public Compra(String codigo, String nombreCliente, LocalDate fechaCompra, double precioCompra, boolean pagoTarjeta) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.pagoTarjeta = pagoTarjeta;
    }

    // Constructor sin codigo
    public Compra(String nombreCliente, LocalDate fechaCompra, double precioCompra, boolean pagoTarjeta) {
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.pagoTarjeta = pagoTarjeta;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
    public LocalDate getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(LocalDate fechaCompra) { this.fechaCompra = fechaCompra; }
    public double getPrecioCompra() { return precioCompra; }
    public void setPrecioCompra(double precioCompra) { this.precioCompra = precioCompra; }
    public boolean isPagoTarjeta() { return pagoTarjeta; }
    public void setPagoTarjeta(boolean pagoTarjeta) { this.pagoTarjeta = pagoTarjeta; }
}