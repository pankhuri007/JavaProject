import java.util.Scanner;
public class Power {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int x=n;
        System.out.println("enter a power:");
        int p= sc.nextInt();
        sc.close();
        for(int i=1;i<p;i++){
            n=x*n;
        }
        System.out.println(n);

    }
}
