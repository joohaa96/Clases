package org.example.Deberes;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DeberesParteDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;
        System.out.println("Dime un numero 1");
        num = sc.nextInt();
        System.out.println("Dime numero 2");
        num2 = sc.nextInt();

        sumar(num,num2);
    }
    public static void sumar (int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
