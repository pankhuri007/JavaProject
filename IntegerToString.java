import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        String s=String.valueOf(n);
        String a=Integer.toString(n);
        System.out.println(s);
        System.out.println(a);
    }
}
