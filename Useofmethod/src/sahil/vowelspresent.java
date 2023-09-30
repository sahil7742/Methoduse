package sahil;
import java.util.Scanner;
public class vowelspresent {

	public static void main(String[] args) {
		System.out.println("enter name");
		Scanner input =new Scanner (System.in);
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
	}

}
