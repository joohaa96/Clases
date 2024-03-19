package org.example.Deberes;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DeberesParteDos {
    public static void main(String[] args) {
        sumar();
    }
    public static void sumar () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero 1");
        int num = sc.nextInt();
        System.out.println("Dime numero 2");
        int num2 = sc.nextInt();
        System.out.println(num + num2);
    }

}
