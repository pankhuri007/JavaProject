import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size:");
        int s= sc.nextInt();
        System.out.println("enter your array elements:");
        int[] a=new int[s];
        for(int j=0;j<s;j++){
            a[j]= sc.nextInt();
        }
        System.out.println("enter the element to be found:");
        int n =sc.nextInt();
        boolean isFound=false;
        for(int i=0;i<s;i++){
            if(n==a[i]) {
                System.out.println("element is founded");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("element is not found");
        }
    }
}
