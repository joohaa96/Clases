package org.example.Clases;

public class Clasedos {


    public static void main(String[] args) {
        int number = 5;
        int numberTwo = 3;

        int numOne = 1;
        int numTwo = 4;

        multiplicar(number, numberTwo);
        multiplicar(numOne, numTwo);

        double numberDivideOne = 4.4;
        double numberDivideTwo = 5.6;
        double resultOne = dividir(numberDivideTwo, numberDivideOne);
        System.out.println(resultOne);
        
    }


    public static void multiplicar(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static double dividir (double num1, double num2){
        double resultado = num1 / num2;
        return resultado;
    }



}
