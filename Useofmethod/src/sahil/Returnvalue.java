package sahil;

public class Returnvalue {
	//create a method
	/*static void addNumber(int a,int b) {
		int sum = a + b ;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		 addNumber(1,2);
		

	}*/
	
	
	
	/*static double addNumber(double a,double b) {
		 double sum;
		 sum = a +b ;
		 return sum;
		 
	 }
	 public static void main(String[] args) {
		 double result;
		 result = addNumber(8.96,78.65);
		 System.out.println(result);
	 }
	 */
	/*static boolean oddevencheck(int a) {
		if (a%2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		int number = 23;
		boolean result = oddevencheck(number);
		System.out.println("is number even ?   : " + result);
	}*/
	
	
	
	/*static int totalsum(int number) {
		int sum = 0;
		for (int i = 1; i<=number; ++i) {
			sum +=i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		int result = totalsum(10);
		System.out.println("result : " + result);
	}*/
	
	static boolean checkprime(int number) {

		for (int i = 2; i < number; ++i) {

			if (number % i == 0) {
			return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean result = checkprime(31);
		if (result) {
			System.out.println("prime number ");
		} else
			System.out.println("not a prime number");
	}

}
