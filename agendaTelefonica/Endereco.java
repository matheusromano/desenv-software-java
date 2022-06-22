package agendaTelefonica;

public class Endereco {
  private String logradouro;
  private int numeros;
  private String complement;
  private String bairro;
  private int CEP;
  private String cidade;


  public Endereco(String logradouro, int numeros, String complement, String bairro, int CEP, String cidade) {
    this.logradouro = logradouro;
    this.numeros = numeros;
    this.complement = complement;
    this.bairro = bairro;
    this.CEP = CEP;
    this.cidade = cidade;
  }


  public String getLogradouro() {
    return logradouro;
  }


  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }


  public int getNumeros() {
    return numeros;
  }


  public void setNumeros(int numeros) {
    this.numeros = numeros;
  }


  public String getComplement() {
    return complement;
  }


  public void setComplement(String complement) {
    this.complement = complement;
  }


  public String getBairro() {
    return bairro;
  }


  public void setBairro(String bairro) {
    this.bairro = bairro;
  }


  public int getCEP() {
    return CEP;
  }


  public void setCEP(int CEP) {
    this.CEP = CEP;
  }


  public String getCidade() {
    return cidade;
  }


  public void setCidade(String cidade) {
    this.cidade = cidade;
  }


  @Override
  public String toString() {
    return "Endereco [CEP=" + CEP + ", bairro=" + bairro + ", cidade=" + cidade + ", complement=" + complement
        + ", logradouro=" + logradouro + ", numeros=" + numeros + "]";
  } 
}


