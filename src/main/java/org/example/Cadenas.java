package org.example;

public class Cadenas {
    public static void main (String [] args) {


        String nombre =  ("Sofia");
        String apellido = (" Martinez");
        String nom = (nombre + " " + apellido);

        String nombreUno = ("Julia");
        String apellidoUno= (" Perez");
        String nomUno = ( nombreUno + " "+ apellidoUno);

        String nombreDos=("Matias");
        String apellidoDos=(" Camacho");
        String nomDos= ( nombreDos + " "+ apellidoDos);

        info(nomUno); //llamo al metodo
        info(nomDos);

        System.out.println(nom); //me imprime dato

    }

     public static void info (String nom) { //, no llama los dos restantes.


        String nombre = ("Elefante");
        int edad = 6;
        String resul = (nombre + " " + edad + " años");
        masdato(resul);

        System.out.println(resul);
    }
        public static void masdato (String resul) {

        }

}

