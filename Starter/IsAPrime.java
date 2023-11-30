import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for (int i = 1; i <= t; i++) {
      int n = scn.nextInt();
      boolean f = isPrime(n);
      if (f)
        System.out.println("prime");
      else
        System.out.println("not prime");
    }
  }
  
  public static boolean isPrime(int x) {
      if (x <= 2) {
          return true;
      }
      for (int i = 2; i * i <= x; i++) {
          if (x % i == 0) {
              return false;
          }
      }
      return true;
  }
}