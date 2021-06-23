import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        int fact = factorial(n);
        System.out.println(fact);
    }
        public static int factorial(int n1){
            if(n1==0){
                return 1;
            }
            else{
                return n1*factorial(n1-1);
            }
        }

}
