package org.example;

public class ArrayClases {
    public static void main(String[] args) {
        String nombre = "dani";
        String nombreDos = "Johanna";

        int edad = 21;
        int edadJohana = 27;

        String[] arrayNombres = new String[2];
        arrayNombres[0] = nombre;
        arrayNombres[1] = nombreDos;

        String[] arrayNombresVersionDos = {"dani", "johanna", "fernando"};


        printArrayForNormal(arrayNombres);
        printArrayForNormal(arrayNombresVersionDos);
    }

    public static void printArrayForNormal(String[] arrayNombres) {
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }

        // Recorremos primera vez
        // indice esta en 0 ( i = 0)
        // el indice (0) es menor que la longitud del array? Si
        // Entonces pintamos el valor dentro del array que esta con este indice System.out.println(a[i]); ---> Dani
        // Indice++ (int i = i + 1) --> i = 1

        // Recorremos segunda vez
        // indice esta en 1 ( i = 1 )
        // El indice 1 es menor que la longitud del array? Si
        //Entonces pintamos el valor dentro del array que esta con este indice System.out.println(a[i]); ----> Johanna
        //Indice++ (int i = i + 1) ---> i = 2

        //Recorremos tercera vez
        //Indice esta en 2
        //El indice (2) es menor que la longitud del array

    }

    //Un metodo al que le pases un array con 10 numeros. De este array necesito que encuentres el numero mas grande y lo imprimas por pantalla. Utiliza el bucle for
    // Un metodo al que le pases un array con tu nombre divido letra por letra. Recorres el array y imprimes tu nombre letra por letra pero al reves.


}
