import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size:");
        int n=sc.nextInt();
        Integer[] a=new Integer[n];
        System.out.println("enter your array elements:");
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        List<Integer> l= Arrays.asList(a);
        Collections.reverse(l);
        System.out.println(l);
    }
}
