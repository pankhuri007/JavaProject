import java.util.Scanner;

public class DeleteDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] a=new int[n];
        for(int h=0;h<n;h++){
            a[h]=sc.nextInt();


        }
        int j=0;
        for(int i=0;i<a.length-1;i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
            a[j]=a[a.length-1];
            for(int k=0;k<=j;k++){
                System.out.print(a[k]+ " ");

        }
    }
}
