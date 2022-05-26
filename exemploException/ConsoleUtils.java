package exemploException;

import java.util.Scanner;

public class ConsoleUtils {
  // Using static tranform the method in a static method wich can be called
  // without instantiating the class(class member)
  public static int readInt(String prompt) {
    System.out.print(prompt);
    Scanner sc = new Scanner(System.in);
    while (true) {
      String newLine = sc.nextLine();
      try {
        int num = Integer.parseInt(newLine);
        sc.close();
        return num; 
      } catch (NumberFormatException e) {
        System.out.print("Invalid number, try again: ");
        // System.out.println(e.getMessage());
        // e.printStackTrace();
      }
    }
  }
}
