import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println("Enter a second number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
