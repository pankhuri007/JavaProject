import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sc.close();
        int a=1,b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int f=0;
        while(f<=n){
            f=a+b;
            if(f>n)
                break;
            System.out.print(f + " ");
            a=b;
            b=f;
        }
    }
}
