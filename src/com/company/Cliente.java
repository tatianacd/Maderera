package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String direccion;
    private LocalDate fechaDeRetiro;
    Scanner sc = new Scanner(System.in);
    double precio = 3000;
    public Cliente(String nombre, String direccion, LocalDate fechaDeRetiro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaDeRetiro = fechaDeRetiro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaDeRetiro() {
        return fechaDeRetiro;
    }

    public void setFechaDeRetiro(LocalDate fechaDeRetiro) {
        this.fechaDeRetiro = fechaDeRetiro;
    }


    public void comprarModelo(Integer numeroDePlaca, LocalDate fechaDeRetiro, String nombreDelCliente, Integer cantidad){


        if(numeroDePlaca == 1 || numeroDePlaca == 2 || numeroDePlaca == 3){


            System.out.println("¡ "+nombreDelCliente+" ! El total a pagar es : " + precio * cantidad);


        }else{

            System.out.println("¡ "+nombreDelCliente+" ! El total a pagar es: " + (precio * 0.2 + precio) * cantidad);

        }

    }

}


