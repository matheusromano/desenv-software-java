package aula04;
import java.util.Scanner;

public class LacoForComInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que deseja calcular a tabuada: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d x %d = %d\n", num, i, result);
        }
    }
}
