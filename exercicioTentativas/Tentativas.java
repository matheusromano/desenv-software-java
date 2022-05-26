package exercicioTentativas;

import java.util.Random;
import java.util.Scanner;

public class Tentativas{
    public static void main(String[] args) {
        Random gerador =  new Random();
        Scanner sc = new Scanner(System.in);
        int numero = gerador.nextInt(101);
        int chances = 10;
        if(numero > 100 || numero < 0) {
            System.out.println("O número sorteado precisa estar entre 0 e 100");
        } else{
            do{
                System.out.printf("Digite o número que você acha que foi sorteado: \n (Você tem %d chances)", chances);
                int chute = sc.nextInt();
                if(chute == numero){
                    System.out.printf("Parabéns você acertou!!! Você chutou o número %d e o número sorteado foi %d", chute, numero);
                    chances = -1;
                } else{
                    if(chute > numero){
                        System.out.println("O numero sorteado foi menor que o digitado.. tente novamente");
                    } else {
                        System.out.println("O numero sorteado foi maior que o digitado.. tente novamente");
                    }
                    
                }
                
                chances--;
            } while (chances >= 1);
            System.out.println("Suas chances se esgotaram, você perdeu!");
            sc.close();
        }



        
    }
}