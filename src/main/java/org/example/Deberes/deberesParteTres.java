package org.example.Deberes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class deberesParteTres {
    public static void main(String[] args) {
        List<String> nombresLista = new ArrayList<>();
        nombresLista.add("Dani");
        nombresLista.add("Johanna");
        nombresLista.add("Diego");
        nombresLista.add("Eugeny");
        nombresLista.add("Igor");
        nombresLista.add("Alberto");

        List<String> nombresListaDos = new ArrayList<>();
        nombresListaDos.add("Dani");
        nombresListaDos.add("Johanna");
        nombresListaDos.add("Diego");
        nombresListaDos.add("Eugeny");
        nombresListaDos.add("Igor");
        nombresListaDos.add("Alberto");
        nombresListaDos.add("Kate");


      List<String> resultado = finalMethod(nombresLista);

      System.out.println(resultado);

    }

        public static List<String> finalMethod(List<String> lista){
            if (lista.isEmpty()) {
                System.out.println("La lista esta vacia");
                return lista;
            } else if (lista.contains("Kate")) {
                System.out.println("Lista no valida");
                return new ArrayList<>(); // devolver lista vacia, se crea una nueva porque no hay vacia por eso el new
            } else {
                List<String> listaConA = new ArrayList<>();

                for (String nombre : lista) {
                   if (nombre.toLowerCase().contains("a")) {
                        listaConA.add(nombre);
                    }

                   //1 paso (Dani)
                    // El nombre contiene "a" ? - si
                    // Creamos Lista nueva
                    // Le añadimos el nombre
                    // devolvemos la lista (return)

                    // 2 paso (Johanna)
                    // El nombre contiene "a" ? - si
                    // Creamos Lista nueva
                    // Le añadimos el nombre
                    // devolvemos la lista (return)

                }
                return listaConA;

            }
        }

        // 1. Crear un metodo al cual vas a pasar 2 argumentos. Uno sera el array de numeros enteros y el segundo sera un numero entero. Integer[] arrayNumeros, int target
        //El metodo tiene que devolver un array de 2 numeros que si se suman son iguales al numero entero que es pasado como argumento.
        //Ej. [1, 2, 8, 10, 11]  - array.     12 - target.      El metodo tiene que devolver (return) un array de [2, 10] Porque 2 y 10 suman 12.
}

