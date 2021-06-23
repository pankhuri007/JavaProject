import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        sc.close();
        char[] a=s.toCharArray();
        String r="";
        for(int i=a.length-1;i>=0;i--){
            r=r+a[i];

        }
        if(s.equals(r)){
            System.out.println("String is a Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
    }
}
