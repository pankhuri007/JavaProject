import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n= sc.nextInt();
        System.out.println("enter array elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));
    }
}
