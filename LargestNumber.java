import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
        System.out.println("enter numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        if(a>b&&a>c){
            System.out.println(a + " is the largest element");
        }
        if(b>c){
            System.out.println(b +" is the largest element");
        }
        else{
            System.out.println(c+ " is the largest elemnent");
        }
    }
}
