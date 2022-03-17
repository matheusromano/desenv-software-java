package aula02;

import java.util.Scanner;

public class exCalendario {
    public static String calendarioIfElse(int mes) {
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = ("Mês de janeiro");
        } else if (mes == 2) {
            nomeMes = ("Mês de fevereiro");
        } else if (mes == 3) {
            nomeMes = ("Mês de março");
        } else if (mes == 4) {
            nomeMes = ("Mês de abril");
        } else if (mes == 5) {
            nomeMes = ("Mês de maio");
        } else if (mes == 6) {
            nomeMes = ("Mês de junho");
        } else if (mes == 7) {
            nomeMes = ("Mês de julho");
        } else if (mes == 8) {
            nomeMes = ("Mês de agosto");
        } else if (mes == 9) {
            System.out.println("Mês de setembro");
        } else if (mes == 10) {
            nomeMes = ("Mês outubro");
        } else if (mes == 11) {
            nomeMes = ("Mês de novembro");
        } else if (mes == 12) {
            nomeMes = ("Mês de dezembro");
        } else {
            nomeMes = ("Este mês não é valido");
        }
        return nomeMes;

    }

    public static String calendarioSwitchCase(int mes) {
        String nomeMes = "";
        switch (mes) {
            case 1:
                nomeMes = ("Mês de janeiro");
                break;
            case 2:
                nomeMes = ("Mês de fevereiro");
                break;
            case 3:
                nomeMes = ("Mês de março");
                break;
            case 4:
                nomeMes = ("Mês de abril");
                break;
            case 5:
                nomeMes = ("Mês de maio");
                break;
            case 6:
                nomeMes = ("Mês de junho");
                break;
            case 7:
                nomeMes = ("Mês de julho");
                break;
            case 8:
                nomeMes = ("Mês de agosto");
                break;
            case 9:
                nomeMes = ("Mês de setembro");
                break;
            case 10:
                nomeMes = ("Mês outubro");
                break;
            case 11:
                nomeMes = ("Mês de novembro");
                break;
            case 12:
                nomeMes = ("Mês de dezembro");
                break;
            default:
                nomeMes = ("Esté mês não é valido");
                break;
        }
        return nomeMes;

    }

    // função principal
    public static void main(String[] args) {
        System.out.println("Bem vindo ao meu Programa de Calendario");
        Scanner sc = new Scanner(System.in);
        Scanner rs = new Scanner(System.in);
        try {
            // Ler o numero digitado no teclado
            System.out.print("Digite o numero do mês desejado: ");
            Integer num = sc.nextInt();
            System.out.print("Escolha por qual metodo quer ter o resultado \n'IE' para ifelse e 'SC' para switchcase: ");
            String metodo = rs.nextLine();
            if (metodo.equals("IE")) {
                System.out.println(calendarioIfElse(num)); 
            } else if (metodo.equals("SC")) {
                System.out.println(calendarioSwitchCase(num));
            } else {
                System.out.println("metodo inválido");
            }
        } finally {
            sc.close();
            rs.close();
        }
    }
}
