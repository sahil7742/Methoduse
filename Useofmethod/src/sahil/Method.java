package sahil;
import java.util.Scanner;
public class Method {
	static void printnumber(int n ) {
		//use of method to find out prime
		
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
		System.out.println("enter number");
		Scanner input = new Scanner(System.in);
		int d = input.nextInt();
		printnumber (d);

	}

}
