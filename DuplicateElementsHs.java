import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementsHs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashSet<Integer> h=new HashSet<Integer>();
                for(int j=0;j<a.length;j++){
                    if(h.add(a[j])==false){
                        System.out.println(a[j]+" is a duplicate element ");
                    }
                }
    }
}
