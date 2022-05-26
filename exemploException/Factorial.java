package exemploException;

public class Factorial {
  public static long caculateFactorial(int num) throws IllegalArgumentException{
    if (num >= 0) {
      long factorial = 1;
      for (int i = 2; i <= num; i++) {
        factorial *= i;
      }
      return factorial;
    }else{
      throw new IllegalArgumentException("Invalid number, doesn't support negative numbers");
    }
  }
}
