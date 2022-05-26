package exemploException;

public class ProgramaPrincipal {
  public static void main(String[] args) {
    int num = ConsoleUtils.readInt("Enter a number: ");
    // System.out.printf("You entered: %d", num);
    try {
      long fact = Factorial.caculateFactorial(num);
      System.out.printf("Factorial of %d is %d", num, fact);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("\nFinished program. Feels good to be back!");
    }
  }

}