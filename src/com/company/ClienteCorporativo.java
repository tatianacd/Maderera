package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class ClienteCorporativo extends Cliente{

    Scanner sc = new Scanner(System.in);
    public ClienteCorporativo(String nombre, String direccion, LocalDate fechaDeRetiro) {
        super(nombre, direccion, fechaDeRetiro);
    }

    public void comprarCorte(Integer cantidad,String nombre, LocalDate fechaDeRetiro){

        if(cantidad > 2){
            System.out.println(" ¡ " + nombre +"! Solo puedes pedir placas enteras o uno u dos cortes.");

        }else{
            if(is10Dias(fechaDeRetiro)){
                System.out.println(" ¡ " + nombre +" ! Como lo retiraste en los primeros 10 dias del mes tienes un 20% de descuento adicional, EL total a pagar es de : " + ((cantidad * 150) - 150 * 0.2));
            }else{
                System.out.println(" ¡ " + nombre +" ! EL total a pagar es de : " + cantidad * 150);
            }

        }

    }
}
