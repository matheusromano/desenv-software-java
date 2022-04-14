
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    private int RGM;
    private String nome;
    private int anoIngresso;

    
    public Aluno(int RGM, String nome, int anoIngresso)
    {
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }

    public int getRGM(){
        return this.RGM;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getAnoIngresso(){
        return this.anoIngresso;
    }
    
    public void setRGM(int RGM){
        this.RGM = RGM;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    
    @Override
    public String toString() {
        return super.toString() + ":\n"
        + String.format("RGM: %d\nNome: %s\nAno Ingresso: %d\n", this.RGM, this.nome, this.anoIngresso);
    }
    
}
