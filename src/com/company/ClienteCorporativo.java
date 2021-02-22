package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class ClienteCorporativo extends Cliente{

    Scanner sc = new Scanner(System.in);
    public ClienteCorporativo(String nombre, String direccion, LocalDate fechaDeRetiro) {
        super(nombre, direccion, fechaDeRetiro);
    }

    public void comprarCorte(Integer cantidad,String nombre, LocalDate fechaDeRetiro){

        if(cantidad > 3){
            System.out.println(" ¡ " + nombre +"! Solo puedes pedir placas enteras o uno u dos cortes");

        }else{
            System.out.println(" ¡ " + nombre +" ! EL total a pagar es de : " + cantidad * 150);
        }

    }
}
