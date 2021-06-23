import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println("enter the element to be searched:");
        int x= sc.nextInt();
        int c=0;
        for(int j=0;j<n;j++) {
            if (x == a[j]) {
                System.out.println("Element is in the given array");
                c++;
                break;
            }
        }
        if(c==0){
            System.out.println("elements is not there in the array");
        }
    }
}
