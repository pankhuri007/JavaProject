import java.util.Scanner;

public class RightPascalTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int s=n-1;s>0;s--){
            for(int k=1;k<=s;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
