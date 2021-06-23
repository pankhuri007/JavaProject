import java.util.Scanner;

public class Square {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        sc.close();
        int s=n*n;
        int c=n*n*n;
        System.out.println(s);
        System.out.println(c);
    }
}
