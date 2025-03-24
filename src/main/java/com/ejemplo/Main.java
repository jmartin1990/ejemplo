package com.ejemplo;

import com.ejemplo.modelo.Usuario;
import com.ejemplo.modelo.Producto;
import com.ejemplo.modelo.Compra;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // a) Crear 5 usuarios distintos e imprimirlos por consola
        Usuario usuario1 = new Usuario(1, "Juan", "password1", 25, "juan@example.com");
        Usuario usuario2 = new Usuario(2, "Maria", "password2", 30, "maria@example.com");
        Usuario usuario3 = new Usuario(3, "Pedro", "password3", 22, "pedro@example.com");
        Usuario usuario4 = new Usuario(4, "Ana", "password4", 28, "ana@example.com");
        Usuario usuario5 = new Usuario(5, "Luis", "password5", 35, "luis@example.com");

        System.out.println("Usuarios:");
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
        System.out.println(usuario5);

        // b) Crear 5 productos e imprimirlos por consola
        Producto producto1 = new Producto("REF001", "Laptop", "Laptop de 15 pulgadas", 1200.0);
        Producto producto2 = new Producto("REF002", "Smartphone", "Smartphone de última generación", 800.0);
        Producto producto3 = new Producto("REF003", "Tablet", "Tablet de 10 pulgadas", 400.0);
        Producto producto4 = new Producto("REF004", "Monitor", "Monitor de 24 pulgadas", 200.0);
        Producto producto5 = new Producto("REF005", "Teclado", "Teclado mecánico", 100.0);

        System.out.println("\nProductos:");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);

        // c) Crear 5 compras e imprimirlos por consola
        Compra compra1 = new Compra("C001", "Juan", LocalDate.now(), 1200.0, true);
        Compra compra2 = new Compra("C002", "Maria", LocalDate.now(), 800.0, false);
        Compra compra3 = new Compra("C003", "Pedro", LocalDate.now(), 400.0, true);
        Compra compra4 = new Compra("C004", "Ana", LocalDate.now(), 200.0, false);
        Compra compra5 = new Compra("C005", "Luis", LocalDate.now(), 100.0, true);

        System.out.println("\nCompras:");
        System.out.println(compra1);
        System.out.println(compra2);
        System.out.println(compra3);
        System.out.println(compra4);
        System.out.println(compra5);
    }
}