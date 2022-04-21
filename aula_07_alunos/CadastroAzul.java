package aula_07_alunos;
import java.util.Scanner;

public class CadastroAzul {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        do{
            System.out.printf("============= Aluno %d =============\n", contador);
            System.out.println("Digite o RGM do aluno: ");
            int RGM = sc.nextInt();
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.next();
            System.out.println("Digite o ano de ingresso do aluno: ");
            int anoIngresso = sc.nextInt();
            alunos[contador - 1] = new Aluno(RGM, nome, anoIngresso);
            contador ++;
        }while(contador <= alunos.length);

        System.out.printf("\n============ Lista de Alunos ============\n");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString());
            
        }

        sc.close();
    }
}
