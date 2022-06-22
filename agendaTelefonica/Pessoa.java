package agendaTelefonica;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Pessoa {
  private String nome;
  private int rg;
  private Date dataNascimento;
  private HashMap<String, String> email;
  private HashMap<String, Integer> telefone;
  private HashMap<String, Endereco> endereco;


  public Pessoa(String nome, int rg, Date dataNascimento, HashMap<String, String> email,
      HashMap<String, Integer> telefone, HashMap<String, Endereco> endereco) {
    this.nome = nome;
    this.rg = rg;
    this.dataNascimento = dataNascimento;
    this.email = email;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  public Pessoa criarPessoa() {
    Pessoa p = new Pessoa(nome, rg, dataNascimento, email, telefone, endereco);
    p.setNome("Matheus");
    p.setRg(1235445667);
    p.setDataNascimento(new Date(153251639));
    



    return Pessoa;
  }


  // getters and setters
  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public int getRg() {
    return rg;
  }


  public void setRg(int rg) {
    this.rg = rg;
  }


  public Date getDataNascimento() {
    return dataNascimento;
  }


  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }


  public HashMap<String, String> getEmail() {
    return email;
  }


  public void setEmail(HashMap<String, String> email) {
    this.email = email;
  }


  public HashMap<String, Integer> getTelefone() {
    return telefone;
  }


  public void setTelefone(HashMap<String, Integer> telefone) {
    this.telefone = telefone;
  }


  public HashMap<String, Endereco> getEndereco() {
    return endereco;
  }


  public void setEndereco(HashMap<String, Endereco> endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Pessoa [dataNascimento=" + dataNascimento + ", email=" + email + ", endereco=" + endereco + ", nome=" + nome
        + ", rg=" + rg + ", telefone=" + telefone + "]";
  }
}
