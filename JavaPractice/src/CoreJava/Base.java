package CoreJava;

public class Base {

	public static void main(String[] args) {
		
		Base.reverseWordsAtSamePosition("Hello world from Java");
//		Base.pattern2(5, 5);
//		Base.pattern1(5, 5);

	}
	
	public static void reverseWordsAtSamePosition(String str) {
		 
	    
	}
	
	public static void pattern2(int row, int col) {
		for (int i = row; i >= row; i--) {
			for (int j = col; j >= col; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

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