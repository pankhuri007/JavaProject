import java.util.Scanner;

public class RemainderWithoutModulus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your dividend:");
        int dividend=sc.nextInt();
        System.out.println("enter your divisor:");
        int divisor= sc.nextInt();
        int quotient=dividend/divisor;
        int remainder=dividend-(quotient*divisor);
        System.out.println("The required remainder is:"+ remainder);
    }
}
