import java.util.Arrays;
import java.util.Scanner;

public class MultiplyTwoArrayElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 1st array size:");
        int p= sc.nextInt();
        int[] a=new int[p];
        System.out.println("enter your 2nd array size:");
        int k= sc.nextInt();
        int[] b=new int[k];
        System.out.println("enter your first array elements:");
        for(int i=0;i<p;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter your second array elements:");
        for(int j=0;j<k;j++){
            b[j]=sc.nextInt();
        }
        if(p==k){
            int[] x=new int[p];
            for(int h=0;h<p;h++){
                x[p]=a[p]*b[p];
                System.out.print(Arrays.toString(x));
            }
        }
    }
}
