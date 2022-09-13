package com.java;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andre
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analisis {

    //private static Scanner sc;  //No hay necesidad de crear esta variable static
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;  //se crea para controlar el while

        while(continuar) {
            System.out.println("ingrese comparacion: ");
            String comparacion = sc.nextLine();  //usar este contraseña que es la que match con la regex AngeLreru2021@

            System.out.println("ingrese la expresion regular: ");
            String regex=sc.nextLine();  //usar este regex que es la que match con la variable previamente ingresada Angel

            if(regex.equals("exit"))
                break;
            Pattern patron=Pattern.compile(regex);
            System.out.println("patron" + patron);
            Matcher m=patron.matcher(comparacion);

            boolean coincidencia=m.find();
            if (coincidencia) {
                System.out.println(" hay coincidencia? " + " si hay coincidencia " +  " se ingresaron los siguientes valores " + comparacion + " y " + regex);
                break;
            } else {
                System.out.println(" hay coincidencia? " + " no hay coincidencia " + " se ingresaron los siguientes valores " + comparacion + " y " + regex);
                continuar = true;
            }
        }
    }
}




