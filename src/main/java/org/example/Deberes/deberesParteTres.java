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

        public static void printList (List<String> nombresLista){
        for (String nomb: nombresLista){
            if(nomb.toLowerCase().contains("a") || nomb == null) {
            System.out.println(nomb);
            }
        }
    }

        public static void printListDos (List<String> nombresListaDos){
        for (String nombDos: nombresListaDos){
            if (nombresListaDos.contains("Kate")) {
            System.out.println("Lista no valida");
            }
            return; // devuelvo, pero no no listavacia como tal

            }
    }
}

