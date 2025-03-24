package com.ejemplo.modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String password;
    private int edad;
    private String email;

    // Constructor por defecto
    public Usuario() {}

    // Constructor con todos los parámetros
    public Usuario(int id, String nombre, String password, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.email = email;
    }

    // Constructor sin id
    public Usuario(String nombre, String password, int edad, String email) {
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.email = email;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}