package aula03.exercicioSorteador;

import java.util.Random;

public class Sorteador {
    public static void main(String[] args) {
        Random gerador = new Random();
        int contador = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;
        
        while (contador < 1000) {
            int numero = 1 + gerador.nextInt(100);
            System.out.println(numero);
            if (contador == 0) {
                maior = numero;
                menor = numero;
            }
            
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
            

            soma = numero + soma;
            
            contador++;
        }
        System.out.printf("o contador contou %d\n", contador);
        System.out.printf("A soma dos numeros foi %d\n", soma);
        float media = soma / (float)contador;
        System.out.printf("média dos números sorteados é %.2f\n", media);
        System.out.printf("O menor número digitado é: %d\n", menor);
        System.out.printf("O maior número digitado é: %d\n", maior); 
    }
    
}
