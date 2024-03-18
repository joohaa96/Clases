package org.example.Deberes;

import java.util.Arrays;

public class DeberesParteUno {
    // Dentro de un metodo que utiliza como argumento 1 array de 3 elementos
    // "Tigre", "Elefante" "Gato". Necesito que me saques todos los elementos letra por letra.
    // Hacer una comprobacion extra en el caso de que el array sea nulo.

    // Quiero que me hagas un metodo que coja el input de usuario por consola de 2 numeros, haga la suma y lo imprima

    // "Dani", "Johanna", "Diego", "Eugeny", "Igor", "Alberto"
    // "Dani", "Johanna", "Diego", "Eugeny", "Igor", "Alberto", "Kate"
    //Un metodo que coja como argumento una lista de String. La recorra con un bucle for each. En el caso de que el elemento
    // de la lista contiene la letra "a" crear una lista nueva donde vas a almacenar dichos elementos. El metodo tiene que
    // devolver dicha lista
    //Hacer una comprobacion extra para prevenir los posibles errores (Ej. Lista nula).
    //En el caso de que la lista contiene el nombre de "Kate" imprimir "Lista no valida" y devolver una lista vacia.

    public static void main(String[] args) {
        String[] animales = {"Tigre", "Elefante", "Gato"};
        printAnimales(animales);
    }
    public static void printAnimales (String[]animalesDiv){
        for (String a: animalesDiv){
            String[] letrasAnimales = a.split("");
            for (String divLetras : letrasAnimales) {
                if (letrasAnimales == null){

                System.out.println(divLetras);
               }
            }
        }
    }
}
