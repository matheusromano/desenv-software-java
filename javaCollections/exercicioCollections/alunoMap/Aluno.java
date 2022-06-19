package javaCollections.exercicioCollections.alunoMap;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
  private String nome;
  private int numero_aluno;
  private int serie;
  private Map<String, Aluno> informacoes;

  public Aluno(String nome, int numero_aluno, int serie) {
    this.nome = nome;
    this.numero_aluno = numero_aluno;
    this.serie = serie;
    this.informacoes = new HashMap<String, Aluno>();
  }

  public Aluno() {}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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

  public Map<String, Aluno> getInformacoes() {
    return informacoes;
  }



}
