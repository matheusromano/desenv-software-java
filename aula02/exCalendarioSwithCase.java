package aula02;

import java.util.Scanner;

public class exCalendarioSwithCase {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu Programa de Calendario");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o numero do mês desejado: ");
            Integer num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Mês de janeiro");
                    break;
                case 2:
                    System.out.println("Mês de fevereiro");
                    break;
                case 3:
                    System.out.println("Mês de março");
                    break;
                case 4:
                    System.out.println("Mês de abril");
                    break;
                case 5:
                    System.out.println("Mês de maio");
                    break;
                case 6:
                    System.out.println("Mês de junho");
                    break;
                case 7:
                    System.out.println("Mês de julho");
                    break;
                case 8:
                    System.out.println("Mês de agosto");
                    break;
                case 9:
                    System.out.println("Mês de setembro");
                    break;
                case 10:
                    System.out.println("Mês outubro");
                    break;
                case 11:
                    System.out.println("Mês de novembro");
                    break;
                case 12:
                    System.out.println("Mês de dezembro");
                    break;
                default:
                    System.out.println("Esté mês não é valido");
                    break;
            }

        } finally {
            sc.close();
        }
    }

}
