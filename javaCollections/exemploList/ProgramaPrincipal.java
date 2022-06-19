package javaCollections.exemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {

  public static void main(String[] args) {
    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    pessoas.add(new Pessoa("João", 20, 70.0, 1.80));
    pessoas.add(new Pessoa("Maria", 25, 60.0, 1.60));
    pessoas.add(new Pessoa("José", 30, 50.0, 1.50));
    pessoas.add(new Pessoa("Pedro", 12, 40.0, 1.40));
    pessoas.add(new Pessoa("Paula", 40, 30.0, 1.30));



    System.out.println("Lista de pessoas antes da ordenação:");
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa);
    }

    System.out.println("\nLista de pessoas após a ordenação:");

    Collections.sort(pessoas);

    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa);
    }

    Pessoa p = new Pessoa("Zezinho", 20, 70.0, 1.80);
    p.getTelefones().put("Celular", "9565-8845");
    p.getTelefones().put("Fixo", "3799-9349");
    p.getTelefones().put("comercial", "3325-8688");

    System.out.println("\nTelefone celular: " + p.getTelefones().get("Celular"));
    System.out.println("Telefone fixo: " + p.getTelefones().get("Fixo"));
    System.out.println("Telefone comercial: " + p.getTelefones().get("comercial"));


  }

}
