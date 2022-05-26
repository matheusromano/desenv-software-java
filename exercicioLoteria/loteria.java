package exercicioLoteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class loteria {
    public static void main(String[] args) {
        int contador = 0;
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        List<Integer> numerosSorteados = new ArrayList<Integer>();
        do {
            int numero = 1 + gerador.nextInt(61);
            numerosSorteados.add(numero);
            contador++;
        } while (contador < 6);
        System.out.println("Digite seus 6 números da sorte: ");
        String numerosChutados = sc.nextLine();
        String[] chutesArrayString = numerosChutados.split(" ");
        int[] chutesArrayInt = new int[chutesArrayString.length];
        for (int i = 0; i < chutesArrayString.length; i++) {
            chutesArrayInt[i] = Integer.parseInt(chutesArrayString[i]);
        }
        for(int i = 0; i < numerosSorteados.size(); i++) {
            for(int j = 0; j < chutesArrayInt.length; j++ ){
                if(numerosSorteados.get(i) == chutesArrayInt[j]) {
                    System.out.println("Acertou!");
                }
            }
        }
    }

}
