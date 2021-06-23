import java.util.Scanner;

public class SwapTwoWithoutUsingThirdVariable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 1st number:");
        int a= sc.nextInt();
        System.out.println("enter your 2nd number:");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
