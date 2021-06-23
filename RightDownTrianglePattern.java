import java.util.Scanner;

public class RightDownTrianglePattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed:");
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
