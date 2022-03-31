package aula04;

import java.util.Random;
import java.util.Scanner;

public class SorteioVetor {
    // Atributos
    public static Scanner sc;
    public static int[] vetor;

    // Funções e procedimentos
    public static void sortear() {
        Random gerador = new Random();
        vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + gerador.nextInt(100);
        }

    }

    public static int procurar(int n) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                return i;
            }
        }
        return -1;
    }

    // Rotina principal
    public static void main(String[] args) {
        sortear();
        sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja procurar dentro do vetor: ");
        int n = sc.nextInt();
        int pos = procurar(n);
        while (pos == -1){
            System.out.println("\nNúmero não encontrado, Tente Novamente:");
            n = sc.nextInt();
            pos = procurar(n);
        } 
        System.out.printf("O numero %d se encontra na posicao %d", n, pos);
        sc.close();
    }

}
