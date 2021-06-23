import java.util.Scanner;

public class OddNumber1To10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range:");
        int n= sc.nextInt();
        System.out.println("the odd number between the range 1 to "+ n+ " are:");
        for(int i=0;i<=n;i++){
            if(i%2==1){

                System.out.println(i);
            }
        }
    }
}
