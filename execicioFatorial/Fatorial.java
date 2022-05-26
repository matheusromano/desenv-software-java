package execicioFatorial;

import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero o qual deseja obter o fatorial: ");
        Long num = sc.nextLong();
        Long fatorial = num;
        sc.close();
        if(num < 0) {
            System.out.println("Não é possivel calcular fatorial de um número negativo");
        
        } else if (num == 0) {
            System.out.printf("O resultado o fatorial do numero %d é 1", num);
        } else if( num == 1){
            System.out.printf("O resultado o fatorial do numero %d é 1", num);
        } else {
            for(Long i = num; i > 0; i--){
                if (i >=2){
                    fatorial *= (i-1);
                }
            }
            System.out.printf("O resultado o fatorial do numero %d é %d", num, fatorial);
        }
        
    }
}