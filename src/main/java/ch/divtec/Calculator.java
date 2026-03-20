package ch.divtec;

import java.util.Scanner;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Holla como estas ?");

        Scanner lecteur = new Scanner(System.in);
        System.out.println(lecteur.next());
    }
}
