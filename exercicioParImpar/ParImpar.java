package exercicioParImpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Digite número a ser testado: ");
            num = sc.nextInt();
            if (num >= 0){
                validarNumero(num);
            }
        }while(num >= 0);
        sc.close();
    }

    public static void validarNumero(int num){
        if (num %2==0){
            System.out.printf("O número %d é par\n", num);
        } else{
            System.out.printf("O número %d é impar\n", num);
        }
    }
}
