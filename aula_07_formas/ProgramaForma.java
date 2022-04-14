package aula_07_formas;
public class ProgramaForma {
    public static void main(String[] args) {
        FormaGeometrica fg1 = new FormaGeometrica();
        Circulo cir = new Circulo();
        Triangulo tri = new Triangulo();
        Retangulo ret = new Retangulo();

        System.out.println(fg1+" - "+fg1.getCorPreenchimento());

        System.out.printf("Objeto Circulo: %h\nA cor do circulo é: %s\n\n",cir, cir.getCorPreenchimento());
        System.out.printf("Objeto Triangulo: %h\nA cor do triagulo é: %s\n\n",tri, tri.getCorPreenchimento());
        System.out.printf("Objeto Retangulo: %h\nA cor do retangulo é: %s\n\n",ret, ret.getCorPreenchimento());
        


    }
}
