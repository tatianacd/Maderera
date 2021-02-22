package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class ClienteCorporativo extends Cliente{

    Scanner sc = new Scanner(System.in);
    public ClienteCorporativo(String nombre, String direccion, LocalDate fechaDeRetiro) {
        super(nombre, direccion, fechaDeRetiro);
    }

    public void comprarCorte(){
        System.out.println("Ingrese la cantidad de cortes que desea comprar: ");
        int cantidadDeCortes = sc.nextInt();
        if(cantidadDeCortes > 3){
            System.out.println("Solo puedes pedir placas enteras o uno u dos cortes");

        }else{
            System.out.println("EL total a pagar es de : " + cantidadDeCortes * 150);
        }

    }
}
