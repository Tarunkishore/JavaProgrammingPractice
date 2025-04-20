package CoreJava;

public class P {
	public static void pattern1(int row, int col) {
		for(int i=0; i<=row; i++) {
			for(int j=0; j<=col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
