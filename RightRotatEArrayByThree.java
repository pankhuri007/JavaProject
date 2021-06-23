import java.util.Arrays;
import java.util.Scanner;

public class RightRotatEArrayByThree {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size:");
    int n=sc.nextInt();
    int[] a=new int[n];
        System.out.println("enter your array elements:");
        for(int j=0;j<n;j++){
        a[j]= sc.nextInt();
    }
        System.out.println(Arrays.toString(a));
        System.out.println("enter the number by which the given array to be shift:");
        int k= sc.nextInt();
        for(int j=0;j<k;j++){
    int last=a[a.length-1];
    int s=a.length;
        for(int i=s-1;i>0;i--){
        a[i]=a[i-1];
    }
    a[0]=last;

}
        System.out.println(Arrays.toString(a));
}
}
