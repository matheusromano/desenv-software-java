package aula09_biblioteca;

public class Material {
    private int codigo;
    private String titulo;

    public Material(){

    }

    public Material(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
    }	

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d\nTítulo: %s\n", this.codigo, this.titulo);
    }


    
}
