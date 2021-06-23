import java.util.Scanner;

public class SearchtheElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter your search element:");
        int s= sc.nextInt();
        boolean found=false;
        for(int j=0;j<a.length;j++){
            if(s==a[j]){
                System.out.println("element founded");
                break;
            }

        }
        if(!found){
            System.out.println("element not found");
        }
    }
}
