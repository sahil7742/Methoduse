package sahil;

public class Method {
	static void printnumber(int n ) {
		
		int temp;
		
		boolean isprime = true;
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");

	}
	

	public static void main(String[] args) {
		int x=4;
		printnumber (x);

	}

}
