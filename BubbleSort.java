import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements:");
        for(int k=0;k<n;k++){
            a[k]= sc.nextInt();

        }
        System.out.println(Arrays.toString(a));
        int t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("array after applying bubble sorting :"+ Arrays.toString(a));
    }
}
