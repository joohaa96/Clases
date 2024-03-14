package org.example.Clases;

public class EjerciciosArray {
    public static void main (String[] args){
        int[] arrayNum= {-10,-9,-8,-7,-6,-5,-4,-3,-2, -1};

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




