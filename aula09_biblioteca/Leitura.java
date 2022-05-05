package aula09_biblioteca;

public class Leitura extends Material{
    private String editora;
    private String edicao;


    public Leitura(){
    }

    public Leitura(int codigo, String titulo, String editora, String edicao){
        super(codigo, titulo);
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
}
