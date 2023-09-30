package sahil;
import java.util.Scanner;
public class vowelspresent {

	/*public static void main(String[] args) {
		System.out.println("enter name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		boolean islowervowel, isuppervowel;
		int vowelcount = 0;
		for (int i = 0; i < name.length(); ++i) {
			char ch = name.charAt(i);
			islowervowel = (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u');
			isuppervowel = (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U');
			if (islowervowel || isuppervowel) {
				++vowelcount;
			}

		}
		System.out.println("vowel in name  : " + vowelcount);
	}*/
           // example related to contain string
	/*public static void main(String[] args) {
		String topic = "string methods";
		 boolean result = topic.contains("java");
		 
		 System.out.println(result);
	}*/

			// example related to substring(for selecting word number wise
	/*public static void main(String[] args) {
		String topic = " sahil shrivastava";
		
		 System.out.println(topic.substring(1, 17));
	}*/
	 // example related to join words
	/*public static void main(String[] args) {
		String firstName = "sahil";
		String middleName = "kumar";
		String lastName = "shrivastava";
		  String name = String.join( "_",firstName, middleName, lastName);
		  System.out.println(name);
	}*/
	// example related to replace 
	/*public static void main(String[] args) {
		String topic = " call cat";
		
		System.out.println(topic.replace('c' ,'b'));
	}*/
	// example using replace all
	/*public static void main(String[] args) {
		String name1 = "aabbbaaaacccc";
		String name = "java1234is9985fun ";
		String charter =  "+a-+b";
		//replace "+' with "&" using replace all
		//need to escape "+"
		System.out.println(charter.replaceAll("\\+", "&"));
		// replace "+" with "&"                            both are same statement
		System.out.println(charter.replace("+" , "&"));
		//align for sequence of digits
		
		String align ="\\d+";
		//replace all occurrences of numeric
		//digits by a space
		System.out.println(name1.replaceAll( "aa" , "zz"));
		System.out.println(name.replaceAll( align," "));	
	}*/
	
	
	
	public static void main(String[] args) {
		String name =  "java programing";
		// returns character  at index of given number
		System.out.println(name.charAt(5));
		System.out.println(name.hashCode());
	}
	
	
}
