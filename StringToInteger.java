import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sc.next();
        int n=Integer.parseInt(s);
        int x=Integer.valueOf(s);
        System.out.println(n);
        System.out.println(x);
    }
}
