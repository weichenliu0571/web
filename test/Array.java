public class Array {
	public static void main(String[] args) {
		System.out.println(gcd(13,15));
	}

	public static int gcd(int a, int b) {
		int counter = 0;
		int ans = 0;
		int smaller = a;
		if ( b < a) {
			smaller = b;
		}

		while (counter < smaller + 1) {
			if (a % counter == 0 && b % counter == 0) {
				ans = counter;
			}
			counter += 1;
		}
		return ans;
	}

}
