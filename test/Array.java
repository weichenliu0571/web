public class Array {
	public static void main(String[] args) {
		System.out.println(gcd(13,15));
	}


	  public static int gcd(int a, int b){
      int smaller;
      int counter = 1;
      int accumulatedGCD = 1;
      if (a > b){
        smaller = b;
      }
      else{
        smaller = a;
      }

      while (counter <= smaller){
        if (a % counter == 0 && b % counter == 0){
          accumulatedGCD = counter;
        }
        counter++;
      }
      return accumulatedGCD;
    }

}
