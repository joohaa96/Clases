package org.example.Clases;

public class Main {

    // public, private, protected
    // static (opcional)
    // boolean (true, false), byte (-128, 127), short, int, long, double, float, char, String
    // void (en el caso de que quieras que el metodo no devuelva nada)

    public static int num = 6;
    public static int num1 = 2;


    public static void main(String[] args) {
        sumTwoNumbers(num, num1);
        int resta = restarDosNumeros(num, num1);
        System.out.println(resta);
    }

    public static void sumTwoNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static int restarDosNumeros(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    // 2 metodos:
    // 1. Quiero que me creas un metodo que multiplica 2 numeros y los imprime por pantalla pero no devuelve nada
    // 2. Quiero que me creas un metodo que divida 2 numeros y devuelva el resultado y el resultado lo guardes en una varibale
    // Descargar git utilizando el comando git init

//ejercico 1

    //camelCase


}
