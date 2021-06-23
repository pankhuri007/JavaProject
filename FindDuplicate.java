import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n= sc.nextInt();;
        System.out.println("enter array elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            for(int k=j+1;k<a.length;k++){
                if(a[j]==a[k]){
                    System.out.println(a[j]+" is a duplicate value");
                }
            }
        }
    }
}
