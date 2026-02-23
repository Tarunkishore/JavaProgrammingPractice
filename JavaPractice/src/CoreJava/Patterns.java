package CoreJava;

public class Patterns {
    public static void main(String args[]){
        Patterns.pattern1();
        Patterns.pattern2();
        Patterns.pattern3();
        Patterns.pattern4();
        Patterns.pattern5();
//        Patterns.pattern6();
        Patterns.pattern7();
    }

    public static void pattern1(){
        System.out.println("pattern1");
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(){
        System.out.println("pattern2");
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(){
        System.out.println("pattern3");
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(){
        System.out.println("pattern4");
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(){
        System.out.println("pattern5");
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=0; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    public static void pattern6(){
//        System.out.println("pattern6");
//        int n=5;
//        for(int i=0; i<n; i++){
//
//        }
//    }

    public  static void pattern7(){
        System.out.println("pattern6");
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=0; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=n-2; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=0; l<i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
