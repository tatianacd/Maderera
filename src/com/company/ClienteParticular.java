package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class ClienteParticular extends Cliente{
    Scanner sc = new Scanner(System.in);
    public ClienteParticular(String nombre, String direccion, LocalDate fechaDeRetiro) {
        super(nombre, direccion, fechaDeRetiro);
    }

    public void comprarCorte(){
        System.out.println("ingrese la cantidad de cortes que quiere comprar");
        int cantidadDeCortes = sc.nextInt();
        System.out.println("El total apagar es de: " + cantidadDeCortes * 150.0);


    }


}
