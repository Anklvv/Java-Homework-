package lesson1.api;

import java.util.Scanner;
// Реализовать простой калькулятор

public class task3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Введите операцию - + / * ");
        String k = in.nextLine();
        calc(k);
    }

    static void calc(String k) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int n = in.nextInt();
        System.out.printf("Введите второе число: ");
        int m = in.nextInt();
        switch (k) {
            case "+":
                sum(n, m);
                break;
            case "-":
                dif(n, m);
                break;
            case "/":
                System.out.println(div(n, m));
                break;
            case "*":
                comp(n, m);
                break;
        }
    }

    static void sum(int n, int m) {
        System.out.println(n + m);
    }

    static void dif(int n, int m) {
        System.out.println(n - m);
    }

    static void comp(int n, int m) {
        System.out.println(n * m);
    }

    static double div(int n, int m) {
        return n / m;
    }

}