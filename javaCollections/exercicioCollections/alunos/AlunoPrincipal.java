package javaCollections.exercicioCollections.alunos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AlunoPrincipal {
  public static void main(String[] args) {
    List<Aluno> alunos = new ArrayList<Aluno>();

    for (int i = 0; i < 201; i++) {
      Random random = new Random();
      int serie = random.nextInt(1, 9);
      int numero_aluno = random.nextInt(201);

      alunos.add(new Aluno(numero_aluno, serie));
    }

    System.out.println("Lista de alunos antes da ordenação:");
    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }

    System.out.println("\nLista de alunos após a ordenação:");

    Collections.sort(alunos);

    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }
    
  }
  
}
