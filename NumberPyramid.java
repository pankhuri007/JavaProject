import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
