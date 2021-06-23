import java.util.Scanner;

public class Avg6 {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int x= sc.nextInt();;
            sum=sum+x;

        }
        sum=sum/n;
        System.out.println(sum);
    }
}
