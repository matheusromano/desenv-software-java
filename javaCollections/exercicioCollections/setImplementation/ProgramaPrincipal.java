package javaCollections.exercicioCollections.setImplementation;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ProgramaPrincipal {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<Integer>();

    for (int i = 0; i < 201; i++) {
      Random random = new Random();
      int number = random.nextInt(0, 101);

      numbers.add(number);
    }

    System.out.println("Lista de números unicos da lista:");
    System.out.println(numbers.size()); 
  }
  
}
