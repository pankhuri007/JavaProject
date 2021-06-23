import java.util.Scanner;

public class Even10 {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter number:");
            n=sc.nextInt();
            if(n%2==0){
                sum=sum+n;
            }
        }
        System.out.println(sum);
    }
}
