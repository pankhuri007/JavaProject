import java.util.Scanner;

public class Remainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and a divisor");
        int n=sc.nextInt();
        int x= sc.nextInt();
        System.out.println("Quotient" + n/x);
        System.out.println("Remainder" + n%x);
    }
}
