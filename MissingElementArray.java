import java.util.Scanner;

public class MissingElementArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Array size");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
           a[i]=sc.nextInt();
        }
        int total=0;
        total=n*(n+1)/2;
        for(int j=0;j<n;j++){
            total=total-a[j];
        }
        System.out.println(total);
    }


}
