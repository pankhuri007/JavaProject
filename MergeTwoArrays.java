import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 1st array size:");
        int p= sc.nextInt();
        int[] a=new int[p];
        System.out.println("enter your 2nd array size:");
        int k= sc.nextInt();
        int[] b=new int[k];
        System.out.println("enter your first array elements:");
        for(int i=0;i<p;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter your second array elements:");
        for(int j=0;j<k;j++){
            b[j]=sc.nextInt();
        }
        int l=p+k;
        int[] mergedArray=new int[l];
        int pos=0;
        for(int e:a){
            mergedArray[pos]=e;
            pos++;
        }
        for(int s:b){
            mergedArray[pos]=s;
            pos++;
        }
        System.out.println(Arrays.toString(mergedArray));
        Arrays.parallelSort(mergedArray);
        System.out.println("the sorted merged array is:"+Arrays.toString(mergedArray));
    }
}
