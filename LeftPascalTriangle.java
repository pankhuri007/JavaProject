import java.util.Scanner;

public class LeftPascalTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=1;i<=r-1;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int k=i;k<=r-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

