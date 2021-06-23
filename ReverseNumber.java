import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int original=n;
        int s=0;
        while(n>0){
            int r=n%10;
             s=s*10+r;
            n=n/10;
        }
        System.out.println("the reverse number is "+s);
    }
}
