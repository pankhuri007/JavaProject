import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArrayElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter your elememts:");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();

        }
        int startIndex=0;
        int lastIndex=a.length-1;
        int temp=0;
        while(startIndex<lastIndex){
            temp=a[startIndex];
            a[startIndex]=a[lastIndex];
            a[lastIndex]=temp;
            startIndex++;
            lastIndex--;
        }
        System.out.println("the final array after reverse is:"+ Arrays.toString(a));
    }
}
