import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        int originalnum=n;
        int s=0;
        while (n>0){
            int r=n%10;
             s=s+(r*r*r);
            n=n/10;
        }
        System.out.println(s);
        System.out.println(n);
        if(s==originalnum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }

    }
}
