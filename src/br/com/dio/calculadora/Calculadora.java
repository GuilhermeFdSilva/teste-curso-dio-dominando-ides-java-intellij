package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int a, b;
        System.out.print("Digite o primeiro valor: ");
        a = ent.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = ent.nextInt();
        int somar = somar(a, b);
        int subitrair = subitrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);
        System.out.println("soma: " + somar);
        System.out.println("subtração: " + subitrair);
        System.out.println("multiplicação: " + multiplicar);
        System.out.println("divisão: " + dividir);
    }
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subitrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(int a, int b) {
        return (double) a / b;
    }
}
