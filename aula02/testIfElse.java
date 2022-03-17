package aula02;

public class testIfElse {
    public static void main(String[] args) {
        String mystring = "test";
        Integer myinteger = 10;
        Boolean mybool = false;

        if (mystring == "teste") {
            System.out.println("é test nao teste");
            if (myinteger <= 10) {
                System.out.println("acertou o numero");
                if (mybool != true) {
                    System.out.println("chegou ate aqui");
                } else {
                    System.out.println("parou no terceiro");
                }
            } else {
                System.out.println("parou no segundo");
            }
        } else {
            System.out.println("parou no primeiro");
        }


        String mystring2 = "testando";
        Integer myinteger2 = 45;
        Boolean mybool2 = true;

        if (mystring2 == "test") {
            System.out.println("acertou");
        } else if(myinteger2 <= 0){
            System.out.println("acertou");
        } else if(mybool2 == false) {
            System.out.println("acertou");
        } else {
            System.out.println("errou tudo");
        }
    }
}
