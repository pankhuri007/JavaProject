import java.util.Scanner;

public class TrianglePyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row to be printed:");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
