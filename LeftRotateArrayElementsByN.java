import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayElementsByN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter your array elements:");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("the original array is:"+ Arrays.toString(a));
        System.out.println("enter the number by which the elements to be rotate:");
        int k= sc.nextInt();

        int s=a.length;
        for(int p=0;p<n;p++) {
            int first=a[0];
            for (int j = 0; j < s - 1; j++) {
                a[j] = a[j + 1];

            }
            a[s - 1] = first;
        }
        System.out.println("the final array after rotation is:"+ Arrays.toString(a));
    }
}
