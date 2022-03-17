package aula02;

public class testExpression {
    public static void main(String[] args) {
        Integer x = 6;
        Integer y = -5;
        Integer z = 2;

        int firstExpression = x*x+2-4*y/z+1;
        int secondExpression = 6*(x+2-4*y)/(z+1);
        boolean thirdExpression = 4*x*z<x*x+2-4*y;
        boolean forthExpression = -3*y>=x*z&& x+3*y<0;
        boolean fifthExpression = -3*y >= 5*x*z || !(x+3*y < 0 && -2*y/(z+3) > 1) ;
        System.out.println(firstExpression);
        System.out.println(secondExpression);
        System.out.println(thirdExpression);
        System.out.println(forthExpression);
        System.out.println(fifthExpression);

    }
}
