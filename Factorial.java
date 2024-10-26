import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = scanner.nextInt();
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    System.out.println("The factorial of " + n + " is " + result);
  }
}
