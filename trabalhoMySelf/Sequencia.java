package trabalhoMySelf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sequencia {
  Random gerador = new Random();
  private List<Integer> sequencia = new ArrayList<>();

  public void adicionar() {
    sequencia.add(gerador.nextInt(1, 5));
  }

  public int get(int indice) {
    return sequencia.get(indice);
  }

  public int size() {
    return sequencia.size();
  }

  public boolean estaCorreta(int indice, int corPressionadaPeloJogador) {
    return sequencia.get(indice) == corPressionadaPeloJogador;
  }

  public boolean perdeu() {
    return true;
  }

}
