import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int n= sc.nextInt();
        sc.close();
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
        System.out.println("the number of digits are:"+c);
    }
}
