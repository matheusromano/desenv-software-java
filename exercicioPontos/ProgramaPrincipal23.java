package exercicioPontos;
public class  ProgramaPrincipal23 {
    public static void main(String[] args) {
        Ponto pt1 = new Ponto();
        Ponto pt2 = new Ponto(5,10);
        Ponto pt3 = new Ponto(7,10);

        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        System.out.println(pt3.toString());

        System.out.printf("Distancia pt1 -> origem = %f\n", pt1.distancia());
        System.out.printf("Distancia pt1 -> pt2 = %f\n", pt1.distancia(pt2));
        System.out.printf("Distancia pt2 -> pt3 = %f\n", pt2.distancia(pt3));

    }
    
}