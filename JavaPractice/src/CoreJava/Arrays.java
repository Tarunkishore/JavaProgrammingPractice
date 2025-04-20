package CoreJava;

public class Arrays {
	public static void main(String[] args) {
		Arrays.array1();
		
	}
	public static void array1() {
		int arr[] = {1,2,3,4,5};
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
	}
	public static void array3() {
		int arr[] = {1,2,3,4,5};
//		for(int num:arr[]) {
//			System.out.print(arr[i]);
//			if(i<arr.length-1) {
				System.out.print(",");
//			}
//		}
				System.out.println(arr);
	}
	
	public static void array2() {
		String strArr[] = {"india","indonesia","British India","Japan","USA","Russia"};
		String input = "ind";
		
	
		System.out.println(strArr);
		System.out.println(input);
	
	}
	
}