import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int j=0;j<a.length;j++){
            if(max<a[j]){
                max=a[j];
            }
            if(min>a[j]){
                min=a[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
