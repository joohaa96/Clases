package org.example;

public class EjerciciosArray {
    public static void main (String[] args){
        int[] arrayNum= {1,2,3,4,5,6,7,8,9,10};
        int mayor= 0;


        String[] nombreDividido = {"j","o", "h", "a", "n", "n", "a"};

        printNum(arrayNum, mayor);
        printNombres(nombreDividido);
    }
    public static void printNum (int[] arrayNum, int mayor){
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i]> i) {
                mayor=arrayNum[i];
            }
        }
            System.out.println("El numero mayor es " + mayor );
    }
    public static  void printNombres (String[]nombreDividio){
        for (int i = nombreDividio.length - 1; i >= 0; i--) {
            System.out.println(nombreDividio[i]);

        }
    }
}




