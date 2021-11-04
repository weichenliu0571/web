public class Greet {
  public static void main(String[] args) {
    System.out.println(gcd(5,15));
    System.out.println(gcd(5,11));
    System.out.println(fenceR(3));
    System.out.println(fenceW(3));
    countDown(4);
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

  public static String fenceW (int a) {
    String ans = "|";
    int counter = 1;
    if (a < 1) {
      return "give a positive integer input";
    }

    while (counter < a) {
      ans = ans + "--|";
      counter ++;
    }
    return ans;
  }

  public static void countDown(int a) {
    if (a == 0) {
      System.out.println("...LIFTOFF!");
    } else {
      System.out.println(a);
      countDown(a - 1);
    }
  }
}
