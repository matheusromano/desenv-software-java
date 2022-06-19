package javaCollections.exemploList;

import java.util.HashMap;
import java.util.Map;

public class Pessoa implements Comparable<Pessoa> {
  private String nome;
  private int idade;
  private double peso;
  private double altura;
  private Map<String, String> telefones;

  public Pessoa(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    this.telefones = new HashMap<String, String>();
  }

  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public Map<String, String> getTelefones() {
    return telefones;
  }

  @Override
  public int compareTo(Pessoa p) {
    if(this.idade < p.idade) {
      return -1;
    } else if(this.idade > p.idade) {
      return 1;
    } else {
      return 0;
    }
  }

  
}
