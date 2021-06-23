import java.util.Scanner;

public class PowerOf4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        int n= sc.nextInt();
        sc.close();
        boolean power=false;
        while(n>0){
            int r=n%4;
            if(r!=0){
                break;
            }
            n=n/4;
            if(n==1){
                System.out.println("Given number is apower of 4");
                power=true;
                break;
            }
        }
        if(!power){
            System.out.println("Given number is not a power of 4");
        }
    }
}
