import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int n= sc.nextInt();
        double s=Math.sqrt(n);
        System.out.println(s);
    }
}
