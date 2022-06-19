package javaCollections.exercicioCollections.alunoMap;

public class ProgramaPrincipal {
  public static void main(String[] args) {
    Aluno aluno = new Aluno();
    aluno.getInformacoes().put("rd", new Aluno("Maria", 2, 2));
    aluno.getInformacoes().put("rs", new Aluno("José", 3, 3));
    aluno.getInformacoes().put("am", new Aluno("Pedro", 4, 4));

    System.out.println("Representante Discente: " + aluno.getInformacoes().get("rd"));
    System.out.println("Representante de Sala: " + aluno.getInformacoes().get("rs"));
    System.out.println("Aniversariante do Mes: " + aluno.getInformacoes().get("am"));

  }
}
