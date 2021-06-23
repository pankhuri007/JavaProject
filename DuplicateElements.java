import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int j=0; j<n; j++)
        {
//reading array elements from the user
            a[j]=sc.nextInt();
        }
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);

        }
        Integer[] b=set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(b));
    }
}
