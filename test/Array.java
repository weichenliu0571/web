public class Array {
	public static void main(String[] args) {
		System.out.println(gcd(13,15));
	}


	  public static int gcd(int a, int b){
			if (a == b) {
				return a;
			} else {
				if (a > b) {
					return gcd(b, a - b);
				}
				return gcd(a, b - a);
			}

}
