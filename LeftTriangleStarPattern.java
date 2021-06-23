import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=1;j<2*(5-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
