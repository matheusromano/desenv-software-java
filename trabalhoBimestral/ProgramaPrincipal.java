package trabalhoBimestral;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoaMaisProxima = new Pessoa();
        double distanciaMaisProxima = 10000000000000000d;
        

        Pessoa[] pessoas = new Pessoa[7];
        pessoas[0] = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70);
        pessoas[1] = new Pessoa("Maria", 25, 'F', 50, 70, 100, 50, 90);
        pessoas[2] = new Pessoa("Cristina", 30, 'F', 50, 20, 30, 70, 30);
        pessoas[3] = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        pessoas[4] = new Pessoa("Joao", 27, 'M', 100, 30, 50, 100, 10);
        pessoas[5] = new Pessoa("Jessica", 45, 'F', 85, 60, 70, 50, 60);
        pessoas[6] = new Pessoa("Matheus", 21, 'M', 100, 80, 80, 40, 60);

        char respostaFinal = '\u0000';
        do {
            char resposta = respostaFinal;
            Pessoa pretendente = new Pessoa();
            Scanner input = new Scanner(System.in);
            System.out.println("Digite seu nome: \n");
            String nome = input.nextLine();
            pretendente.setNome(nome);
            System.out.println("Digite sua idade: \n");
            int idade = input.nextInt();
            if (idade < 18) {
                System.out.println("Você precisa ser maior de idade para participar do programa\n");
                break;
            }
            pretendente.setIdade(idade);
            System.out.println("Digite seu gênero: ");
            char genero = input.next().charAt(0);
            if (genero != 'M' && genero != 'F') {
                System.out.println("Genero inválido, você não poderá participar do programa\n");
                break;
            }
            pretendente.setGenero(genero);
            System.out.println("Digite seu gosto de viajar: (0 à 100)\n");
            int gostaViajar = input.nextInt();
            if (gostaViajar < 0 || gostaViajar > 100) {
                System.out.println("O Valor de gosto precisa estar entre 0 e 100\n");
                break;
            }
            pretendente.setGostaViajar(gostaViajar);
            System.out.println("Digite seu gosto de cozinhar: (0 à 100)\n");
            int gostaCozinhar = input.nextInt();
            if (gostaCozinhar < 0 || gostaCozinhar > 100) {
                System.out.println("O Valor de gosto precisa estar entre 0 e 100\n");
                break;
            }
            pretendente.setGostaCozinhar(gostaCozinhar);
            System.out.println("Digite seu gosto de assistir ao cinema: (0 à 100)\n");
            int gostaCinema = input.nextInt();
            if (gostaCinema < 0 || gostaCinema > 100) {
                System.out.println("O Valor de gosto precisa estar entre 0 e 100\n");
                break;
            }
            pretendente.setGostaCinema(gostaCinema);

            System.out.println("Digite seu gosto de balada: (0 à 100)\n");
            int gostaBalada = input.nextInt();
            if (gostaBalada < 0 || gostaBalada > 100) {
                System.out.println("O Valor de gosto precisa estar entre 0 e 100\n");
                break;
            }
            pretendente.setGostaBalada(gostaBalada);
            System.out.println("Digite seu gosto de ficar em casa: (0 à 100)\n");
            int gostaFicarEmCasa = input.nextInt();
            if (gostaFicarEmCasa < 0 || gostaFicarEmCasa > 100) {
                System.out.println("O Valor de gosto precisa estar entre 0 e 100\n");
                break;
            }
            pretendente.setGostaFicarEmCasa(gostaFicarEmCasa);

            for (int i = 0; i < pessoas.length; i++) {
                
                if (pretendente.getGenero() != pessoas[i].getGenero()) {
                    double compatibilidade = pretendente.calcularDistancia(pessoas[i]);
                    if (i == 0) {
                        pessoaMaisProxima = pessoas[i];
                        distanciaMaisProxima = compatibilidade;
                    }
                    if (compatibilidade < distanciaMaisProxima) {
                        pessoaMaisProxima = pessoas[i];
                        distanciaMaisProxima = compatibilidade;
                    }
                }
               
            }
            System.out.printf("A pessoa mais compatível com %s é %s\n", pretendente.getNome(),
            pessoaMaisProxima.getNome());
    System.out.println("Dados da pessoa informada: \n" + pretendente.toString());
    System.out.println("Dados da pessoa mais compatível: \n" + pessoaMaisProxima.toString());
            do{
                System.out.println("Deseja continuar? (S/N)");
                resposta = input.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    System.out.println("Ok");
                    respostaFinal = 'S';
                } else if (resposta == 'N' || resposta == 'n') {
                    System.out.println("Obrigado por participar do programa!");
                    respostaFinal = 'N';
                } else {
                    System.out.println("Resposta inválida, digite novamente");
                }
            }while(resposta != 'N' && resposta != 'S');

        } while (respostaFinal == 'S');
    }
}
