import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayDescendingOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n= sc.nextInt();
        Integer[] a=new Integer[n];
        System.out.println("enter your array elements:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("the array after sorting:"+Arrays.toString(a));
    }
}
