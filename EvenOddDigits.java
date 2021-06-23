import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int ec=0;
        int oc=0;
        sc.close();
        while(n>0){
            int r=n%10;
            if(r%2==0){
                ec++;
            }
            else{
                oc++;
            }
            n=n/10;
        }
        System.out.println(ec +" number of even digits");
        System.out.println(oc + " number of odd digits");
    }
}
