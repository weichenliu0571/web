public class Greet {
  public static void main(String[] args) {
    System.out.println(gcd(5,15));
    System.out.println(gcd(5,11));
  }
  public static int gcd(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
  }
  return a;
}

  public static String fenceR(int a) {
    if (a == 1) {
      return "|";
    } else {
      return "|--" + fenceR(a - 1);
    }
  }
}
