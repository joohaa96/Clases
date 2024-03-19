package org.example.Listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
       List<Integer> numerosSuma = new ArrayList<>();
       numerosSuma.add(1);
       numerosSuma.add(2);
       numerosSuma.add(3);
       numerosSuma.add(4);
       int suma = 0;

       for(Integer numero : numerosSuma){
           // Primera iteracion: numero = 1, suma = 0; 0 = 0 + 1; suma = 1;
           // Segunda iteracion: numero = 2, suma = 1; suma = 1 + 2; suma = 3;
           // Tercera itereacion: numero = 3;
           // Cuarta iteracion: numero = 4;
           if (numero == 3) {
               continue;
           }
           suma = suma + numero;
       }

        System.out.println(suma);

        String[] array = {"Dani"};
        System.out.println(array);

        List<String> listaArray = new ArrayList<>(); //array que no toca tanto los cojones
        listaArray.add("Dani");
        listaArray.add("Johanna");


        List<String> listaLinkedList = new LinkedList<>(); //sirve para trabajar con datos mucho mas grandes, en el caso de que necesites modificarlos o lo que sea
        listaLinkedList.add("Dani");
        listaLinkedList.add("Johanna");


        //for i , for each

        for (String nombre : listaArray) {
            System.out.println(nombre);

        }

    }
}
