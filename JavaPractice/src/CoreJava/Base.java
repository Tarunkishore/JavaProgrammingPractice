package CoreJava;

import java.io.FileNotFoundException;
import java.util.*;


public class Base {

	public static void main(String[] args) throws FileNotFoundException {

//		Base.charSearch();
//		Base.charCount();
//		Base.reverseWordAtSamePosition1();
//		Base.reverseNum(12345);
//		Base.swap2Number(10, 20);
//		Base.reverseSentence();
//		Base.reverseWordsAtSamePosition("Hello world from Java");
//		Base.reverseString("Automation Testing");
//		Base.pattern3(5);
//		Base.pattern2(5);
//		Base.pattern1(5, 5);
//		Base.countDigit();
//		Base.sumDigitString();
//		Base.sumDigitString1();
//		Base.firstNonRepeatingChar();
//		Base.add2num();
//		Base.findDuplicateChar();
//		Base.findUniqueCharacter();
//		Base.numberAppearsExactlyValue();
//		Base.reversePreservingSpecialCharPosition("Tes#t%in&g");
//		Base.collectionsCheck();
//		Base.equalSumPartition();
//		Base.reverseAlternateWordsFirstUpperLastLower();
//		Base.anagram();
//		Base.kthLargest();
//		Base.pattern3();
//		Base.missingNum();
//		Base.checkPrimeNumber();
//		Base.palindromeNumberCheck();
//		Base.palindromeStringCheck();
//		Base.findLargestNum();
//		Base.factorial();
		Base.armstrong();
	}

	public static void armstrong(){
		int num=153, originalNum=num, sum=0;
		while(num!=0){
			int digit=num%10;
			sum+=Math.pow(digit, 3);
			num=num/10;
		}
		if(originalNum==sum){
			System.out.println(originalNum+": "+sum+": "+"Armstrong");
		}
		else{
			System.out.println(originalNum+": "+sum+": "+"Not Armstrong");
		}
	}

	public static void factorial(){
		int n=6, fact=n;
		for(int i=n-1; i>0; i--){
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void findLargestNum(){
		int arr[]={32,43,65,76,21,12,23,54,67,99};
		int temp=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(i!=j && arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		System.out.print(arr[0]+" "+arr[1]);
	}

	public static void palindromeStringCheck(){
		String str="abcba";
		String rev="";
		for(int i=str.length()-1; i>=0; i--){
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}

	public static void palindromeNumberCheck(){
		int num=12321;
		int rev=0;
		int originalNum=num;
		while(num!=0){
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(originalNum==rev){
			System.out.println(originalNum+": "+rev+": "+"Palindrom");
		}
		else{
			System.out.println(originalNum+": "+rev+": "+"Not Palindrom");
		}
	}

	public static void checkPrimeNumber(){
		int num=23;
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
			}
		}
		if(flag){
			System.out.println("Prime Number");
		}
	}

	public static void missingNum() {
		int arr[] = {6, 1, 2, 4, 5};
		int sum =0, missingNum=0, n=arr.length, max = arr[0];
		for(int i=0; i<n; i++){
			sum+=arr[i];
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		missingNum = max*(max+1)/2 - sum;
		System.out.println("Missing number: " + missingNum);

	}


	public static void kthLargest() {
		int[] arr = {5, 3, 9, 1, 5, 9, 7};
		int k = 2;   // Find 2nd largest element
		int n = arr.length;
		int[] temp = new int[n];
		int uniqueCount = 0;
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < uniqueCount; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp[uniqueCount] = arr[i];
				uniqueCount++;
			}
		}
		for (int i = 0; i < uniqueCount - 1; i++) {
			for (int j = 0; j < uniqueCount - i - 1; j++) {
				if (temp[j] < temp[j + 1]) {
					int swap = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = swap;
				}
			}
		}
		if (k <= uniqueCount) {
			System.out.println(k + "th largest element is: " + temp[k - 1]);
		} else {
			System.out.println("Invalid value of k");
		}
	}

	public static void anagram(){
		String input1 = "Earth";
		String input2 = "Heart";
		boolean anagram=true;
		input1=input1.toLowerCase();
		input2=input2.toLowerCase();
		if(input1.length()==input2.length()){
			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();
			for(int i=0; i<arr1.length-1; i++){
				for(int j=0; j<arr2.length-1; j++) {
					if(arr1[j]>arr1[j+1]){
						char temp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = temp;
					}
					if(arr2[j]>arr2[j+1]){
						char temp = arr2[j];
						arr2[j] = arr2[j+1];
						arr2[j+1] = temp;
					}
				}
			}
			for(int k=0; k<arr1.length; k++){
				if(arr1[k]!=arr2[k]){
					anagram=false;
					break;
				}
			}
			if(anagram){
				System.out.println("Anagram");
			}
			else{
				System.out.println("Not Anagram");
			}
		}
		else{
			System.out.println("Not Anagram");
		}
	}

	public static void reverseAlternateWordsFirstUpperLastLower() {
		String str = "java is very easy to learn";
		String[] words = str.split(" ");
		String result = "";
		for(int i=0; i<words.length; i++){
			if(i%2!=0){
				String word = words[i];
				String rev="";
				for(int j=word.length()-1; j>=0; j--){
					char ch = word.charAt(j);
					if(j==word.length()-1){
						rev += (ch+"").toUpperCase();
					} else if (j==0) {
						rev+=(ch+"").toLowerCase();
					}else {
						rev+=ch;
					}
				}
				result+=rev+" ";
			}
			else{
				result +=words[i]+" ";
			}
		}
		System.out.println(result.trim());
	}

	public static void equalSumPartition() {
		int[] arr = {1, 5, 11, 5};
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		if (totalSum % 2 != 0) {
			System.out.println(false);
			return;
		}
		int target = totalSum / 2;
		int n = arr.length;
		int totalSubsets = 1;
		for (int i = 0; i < n; i++) {
			totalSubsets = totalSubsets * 2;   // 2^n
		}
		for (int i = 0; i < totalSubsets; i++) {
			int subsetSum = 0;
			int num = i;
			for (int j = 0; j < n; j++) {
				if (num % 2 == 1) {   // include element
					subsetSum += arr[j];
				}
				num = num / 2;   // move to next bit
			}
			if (subsetSum == target) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}


	public static void collectionsCheck(){
		Collection<String> c = new ArrayList<>();
			c.add("java");
			c.add("wel");
			c.add("java");
		System.out.println(c);
	}

	public static void reversePreservingSpecialCharPosition(String input) {
//		String input = "Tes#t%in&g";
		char[] result = new char[input.length()];
		int j = input.length() - 1;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				result[i] = ch;   // keep special character at same position
			} else {
				while (!((input.charAt(j) >= 'A' && input.charAt(j) <= 'Z') ||
						(input.charAt(j) >= 'a' && input.charAt(j) <= 'z'))) {
					j--;
				}
				result[i] = input.charAt(j);
				j--;
			}
		}
		System.out.println(new String(result));
	}

	public static void numberAppearsExactlyValue(){
		int[] arr = {1, 2, 3, 4, 5, 2, 4, 4, 4};
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == arr[i]) {
				boolean alreadyPrinted = false;
				for (int k = 0; k < i; k++) {
					if (arr[k] == arr[i]) {
						alreadyPrinted = true;
						break;
					}
				}
				if (!alreadyPrinted) {
					System.out.println(arr[i] + " = " + count);
				}
			}
		}
	}

	public static void findUniqueCharacter(){
		String str = "Selenium";
		for(int i=0; i<str.length(); i++){
			char current=str.charAt(i);
			int count=0;
			for(int j=0; j<str.length(); j++){
				if(current == str.charAt(j)){
					count++;
				}
			}
			if(count == 1)
				System.out.print(current);
		}
	}

	public static void findDuplicateChar(){
		String str = "selenium";
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<str.length(); j++){
				if(i!=j && i<j && str.charAt(i) == str.charAt(j)){
					System.out.print(str.charAt(i));
				}
			}
		}
	}

	public static void add2num(){
		int a=2, b=3, sum=0;
		sum=a+b;
		System.out.println(sum);
	}

	public static void firstNonRepeatingChar(){
		String str="testingxpress";
		for(int i=0; i<str.length(); i++){
			boolean unique=true;
			for(int j=0; j<str.length(); j++){
				if(i!=j && str.charAt(i)==str.charAt(j)){
					unique=false;
					break;
				}
			}
			if(unique){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

	public static void sumDigitString(){
		String[] str = {"ja4va", "3fd9jk", "f4g5", "j6h3we"};
		int totalSum = 0;
		for (String s : str) {
			int num = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c >= '0' && c <= '9') {
					num = num * 10 + (c - '0');
				}
			}
			totalSum += num;
		}
		System.out.println(totalSum); // 151
	}

	public static void sumDigitString1(){
		String sentence = "we2lco3me 4to j5ava1 l3ear4ning5 c4ent5er";
		String[] word = sentence.split(" ");
		int sum=0;
		for(String str:word){
			int num=0;
			for(int i=0; i<str.length(); i++){
				char ch=str.charAt(i);
				if(ch>='0' && ch<='9'){
					num = num * 10 +(ch-'0');
				}
			}
			sum+=num;
		}
		System.out.println(sum);
	}


    public static void countDigit(){
		int num = 2147483647;
		int count = 0;
		while(num!=0){
			num/=10;
			count++;
		}
		System.out.println("Number of Digit: "+count);
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

	public static void pattern3(){
		int n=3;
		for(int i=0; i<=n; i++){
			for(int j=0; j<(2*i)+1; j++){
				System.out.print((j+1)+" ");
			}
			System.out.println();
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