package exercicioFibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos termos deseja obter da sequência de Fibonacci: ");
        int termo = sc.nextInt();
        sc.close();
        
        for (int i = 0; i < termo; i++) {
            System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
}
