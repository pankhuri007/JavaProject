import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String c="";
        char[] a=s.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            c=c+a[i];
        }
        System.out.println(c);
    }
}
