package CoreJava;

import java.io.FileNotFoundException;
import java.util.*;


public class Base {

	public static void main(String[] args) throws FileNotFoundException {

//		Base.charSearch();
//		Base.charCount();
		Base.reverseWordAtSamePosition1();
//		Base.reverseNum(12345);
//		Base.swap2Number(10, 20);
//		Base.reverseSentence();
//		Base.reverseWordsAtSamePosition("Hello world from Java");
//		Base.reverseString("Automation Testing");
//		Base.pattern3(5);
//		Base.pattern2(5);
//		Base.pattern1(5, 5);

	}
	
	// Character Count in string
	public static void charCount() {
		System.out.println(".................Char Count Start.....................");
		String name = "Automation Testing using Selenium java";
//		String name = "Automation";
		name = name.toLowerCase();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for (char c : strArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name + " : " + charMap);
		System.out.println(".................Char Count End.....................");
	}

	// Find the character "ind" present in the string
	public static void charSearch() {
		System.out.println(".................Char Search Start.....................");
		ArrayList<String> sc = new ArrayList<>();
		sc.add("india");
		sc.add("Indonesia");
		sc.add("British India");
		sc.add("Bihar");
		sc.add("Delhi");

		String str = "ind";
		for (String s : sc) {
			if (s.toLowerCase().contains(str))
				System.out.println(s);
		}
		System.out.println(".................Char Search End.....................");
	}

	public static void reverseWordAtSamePosition1() {
		String str = "Learning automation from SDET Selenium Automation";
		String s[]=str.split(" ");
		String rev="";
		for(int i=0; i<s.length; i++) {
			for(int j=s[i].length()-1; j>=0; j--) {
				rev=rev+s[i].charAt(j);
			}
			if(i<s.length-1) {
				rev=rev+" ";
			}
		}
		System.out.println(rev);
		
	}

	public static void reverseNum(int input) {
		System.out.println("Input : " + input);
		int rev = 0;
		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;
		}
		System.out.println("Output : " + rev);
	}

	public static void swap2Number(int a, int b) {
		// Approach 1
		System.out.println("--- Approach 1 ---");
		System.out.println("a=" + a + ", " + "b=" + b);
		System.out.println("a=" + b + ", " + "b=" + a);

		// Approach 2
		System.out.println("--- Approach 2 ---");
		System.out.println("a=" + a + ", " + "b=" + b);
		a = a + b; // 10+20=30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20
		System.out.println("a=" + a + ", " + "b=" + b);

		// Approach 3
		System.out.println("--- Approach 3 ---");
		System.out.println("a=" + a + ", " + "b=" + b);
		a = a * b; // 20*10=200
		b = a / b; // 200/10=20
		a = a / b; // 200/20=10
		System.out.println("a=" + a + ", " + "b=" + b);

		// Approach 4
		System.out.println("--- Approach 4 ---");
		System.out.println("a=" + a + ", " + "b=" + b);
		a = a ^ b; // 10^20=30
		b = a ^ b; // 30^20=10
		a = a ^ b; // 30^10=20
		System.out.println("a=" + a + ", " + "b=" + b);

		// Approach 5
		System.out.println("--- Approach 5 ---");
		System.out.println("a=" + a + ", " + "b=" + b);
		b = a + b - (a = b);
		System.out.println("a=" + a + ", " + "b=" + b);
	}

	// input : My Name is Tarun Kishore
	// Output : yM emaN si nuraT erohsiK
	public static void reverseSentence() {
		String input = "My Name is Tarun Kishore";
		String word[] = input.split(" ");
		String rev = "";

		for (int i = 0; i < word.length; i++) {
			for (int j = word[i].length() - 1; j >= 0; j--) {
				rev = rev + word[i].charAt(j);

			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}

	// input : Hello world from Java
	// Output : olleH dlrow morf avaJ
	public static void reverseWordsAtSamePosition(String input) {
		String word[] = input.split(" ");
		String rev = "";
		System.out.println("input at Word[0] : " + word[0]);
		System.out.println("input at Word[1] : " + word[1]);

		for (int i = 0; i < word.length; i++) {
			for (int j = word[i].length() - 1; j >= 0; j--) {
				rev = rev + word[i].charAt(j);
			}
			if (i < word.length - 1)
				rev = rev + " ";
		}
		System.out.println(rev);
	}

	// Input = Automation Testing
	// Output = Automation gnitseT

	public static void reverseString(String input) {
		String word[] = input.split(" ");
		System.out.println("input at Word[0] : " + word[0]);
		System.out.println("input at Word[1] : " + word[1]);

		char chrarray[] = word[1].toCharArray();
		char rev[] = new char[chrarray.length];

		System.out.println("\nCharacter Array without reverse\n");

		for (int i = 0; i < chrarray.length; i++) {
			System.out.println("Character at chrarray[" + i + "] : " + chrarray[i]);
		}
		System.out.println("\nCharacter Array after reversing\n");
		System.out.print(word[0] + " ");

		for (int i = chrarray.length; i > 0; i--) {
			rev[chrarray.length - i] = chrarray[i - 1];

			System.out.print(rev[chrarray.length - i]);
		}
	}

	public static void pattern3(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < rows - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*	
	  
	*****
	 ****
	  ***
	   **
	*
	
	  
	*/
	public static void pattern2(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	
	*
	**
	***
	****
	*****
		
	 */

	public static void pattern1(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*

*****
****
***
**
*

*/