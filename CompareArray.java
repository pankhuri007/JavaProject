import java.util.Arrays;
import java.util.Scanner;

public class CompareArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        if(Arrays.equals(a,b)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
