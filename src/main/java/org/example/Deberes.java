package org.example;

import java.util.Objects;

public class Deberes {
    //Crear tu rama de deberes

    //1. Un metodo que coge como argumentos 2 numeros y imprmir el numero mas grande
    //   Hacer tambien la comprobacion en el caso de que los numeros son iguales y si son iguales imprimir "Son iguales"

    //2. Un metodo que compara 2 nombres independientemente de sus el nombre contiene mayusculas o no.
    //   Si los nombres son iguales imprimir: "Los nombres son iguales"
    //   Si los nombres no son iguales imprimir: "Los nombres no son iguales"

    //Despues de completar los deberes mergear tu rama a develop

    public static void main(String[] args) {
        //Aqui va la declaracion de las variables y las llamadas al metodo

        int num= 2;
        int numOne= 3;

        int a= 3;
        int b= 3;

        String name= "Yan";
        String nameOne= "Marco";

        names(name,nameOne);


        variable(a,b);

        /*int max= Math.max(num, numOne);
        System.out.println(max); */ //podria valer como metodo de comparacion

        if (num < numOne) {
            System.out.println( num + " es menor que" + " " + numOne );
    }
        else {
        System.out.println( numOne + " es mayor" + " " + num );
    }


    }

        //Aqui va el metodo ---->
        public static void variable (int a, int b){
        if (a==b) {
        System.out.println("Son iguales");



    }



    }
    public static void names (String name, String nameOne){
        if (name.equals( nameOne)) {
            System.out.println( "Los nombres son iguales");
        }
            else {
            System.out.println("Los nombres no son iguales" );
        }

    }
    }




