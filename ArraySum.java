import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int e:a) {
            sum=sum+e;

        }
        System.out.println(sum);
    }
}
