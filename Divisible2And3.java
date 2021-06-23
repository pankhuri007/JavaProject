import java.util.Scanner;

public class Divisible2And3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int n= sc.nextInt();
        sc.close();
        if(n%2==0 && n%3==0){
            System.out.println("the number "+ n +" is divisible by 2 and 3");
        }
        else{
            System.out.println("the number "+ n +" is not divisible by 2 and 3");
        }
    }
}
