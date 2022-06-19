package javaCollections.exercicioCollections.alunos;

public class Aluno implements Comparable<Aluno> {
  private int numero_aluno;
  private int serie;

  public Aluno(int numero_aluno, int serie) {
    this.numero_aluno = numero_aluno;
    this.serie = serie;
  }

  public int getNumero_aluno() {
    return numero_aluno;
  }

  public void setNumero_aluno(int numero_aluno) {
    this.numero_aluno = numero_aluno;
  }

  public int getSerie() {
    return serie;
  }

  public void setSerie(int serie) {
    this.serie = serie;
  }

  @Override
  public String toString() {
    return "Pessoa [numero_aluno=" + numero_aluno + ", serie=" + serie + "]";
  }

  @Override
  public int compareTo(Aluno a) {
    if (this.numero_aluno < a.numero_aluno) {
      return -1;
    } else if (this.numero_aluno > a.numero_aluno) {
      return 1;
    } else {
      return 0;
    }
  }
  
}


