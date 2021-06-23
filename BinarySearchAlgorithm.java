import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("enter the element to be searched:");
        int x= sc.nextInt();
        int low=0;
        int high=a.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(x==a[mid]){
                System.out.println("element is found at index "+mid);
                break;
            }
            else if (x<a[mid]){
                high=mid-1;
            }
            else if (x>a[mid]){
                low=mid+1;
            }
        }
        if(low>high){
            System.out.println("the element you entered is not in the given array");
        }

    }
}
