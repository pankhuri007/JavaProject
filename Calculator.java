import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 1st number:");
        double n1= sc.nextDouble();
        System.out.println("enter your operator:");
        char operator=sc.next().charAt(0);
        System.out.println("enter your second number:");
        double n2= sc.nextDouble();
        double result=0.0;
        boolean status=true;
        switch (operator){
            case '+':
                result=n1+n2;
                 break;
            case '-':
                result=n2-n1;
                break;
            case '*':
                result=n1*n2;
                break;
            case '/':
                result=n2/n1;
                break;
            default:
                System.out.println("invalid operator");
                status=false;

        }
        if(status){
            System.out.println(result);
        }
    }
}
