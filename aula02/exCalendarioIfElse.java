package aula02;

import java.util.Scanner;

public class exCalendarioIfElse {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu Programa de Calendario");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o numero do mês desejado: ");
            Integer num = sc.nextInt();
            if (num == 1) {
                System.out.println("Mês de janeiro");
            } else if (num == 2) {
                System.out.println("Mês de fevereiro");
            } else if (num == 3) {
                System.out.println("Mês de março");
            } else if (num == 4) {
                System.out.println("Mês de abril");
            } else if (num == 5) {
                System.out.println("Mês de maio");
            } else if (num == 6) {
                System.out.println("Mês de junho");
            } else if (num == 7) {
                System.out.println("Mês de julho");
            } else if (num == 8) {
                System.out.println("Mês de agosto");
            } else if (num == 9) {
                System.out.println("Mês de setembro");
            } else if (num == 10) {
                System.out.println("Mês outubro");
            } else if (num == 11) {
                System.out.println("Mês de novembro");
            } else if (num == 12) {
                System.out.println("Mês de dezembro");
            } else {
                System.out.println("Este mês não é valido");
            }
        } finally {
            sc.close();
        }
    }
}
