import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        sc.close();
        int rev=0;
        int original=n;
        while(n>0){
          int r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        System.out.println(n);
        System.out.println(rev);
        if(rev==original){
            System.out.println("number is a Palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
