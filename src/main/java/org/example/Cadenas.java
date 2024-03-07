package org.example;

public class Cadenas {
    public static void main (String [] args) {

        String nombre = "Sofia";
        String apellido = "Perez";

        String nombreUno = "Juan";
        String apellidoUno = "Martinez";

        int edad= 6;
        int edadUno= 3;

        datos(nombre, apellido,edad);
        datos(nombreUno, apellidoUno,edadUno);

    }
    public static void datos (String name, String apellido, int edad) {
        System.out.println(edad + " " + apellido + " " + name);
    }




}

