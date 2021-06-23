import java.util.Scanner;

public class DownwardRightTrianglePattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed:");
        int rows=sc.nextInt();
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
