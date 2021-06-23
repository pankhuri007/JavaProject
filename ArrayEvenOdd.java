import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a array size:");
        int n=sc.nextInt();
        System.out.println("enter array elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int e:a) {
            if(e%2==0){
                System.out.println(e + " is an even number");
            }
            else{
                System.out.println(e+ " is an odd number");
            }

        }
    }
}
