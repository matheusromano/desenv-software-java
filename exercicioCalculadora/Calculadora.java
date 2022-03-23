package exercicioCalculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu Programa de Operações Matemáticas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número a ser computado: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número a ser computado: ");
        int num2 = sc.nextInt();
        System.out.println();
        sc.close();
        soma(num1, num2);
        subtracao(num1, num2);
        multiplicacao(num1, num2);
        divisao(num1, num2);
        System.out.println();
        System.out.println("fim do programa de operações matemáticas");
    }

    public static void soma(int x, int y){
        int result = x + y;
        System.out.printf("A soma dos números %d e %d é: %d\n", x, y, result);
    }

    public static void subtracao(int x, int y){
        int result = x - y;
        System.out.printf("A subtração dos números %d e %d é: %d\n", x, y, result);
    }

    public static void multiplicacao(int x, int y){
        int result = x * y;
        System.out.printf("A multiplicação dos números %d e %d é: %d \n", x, y, result);
    }

    public static void divisao(int x, int y){
        int result = x / y;
        System.out.printf("A divisâo dos números %d e %d é: %d\n", x, y, result);
    }
}
