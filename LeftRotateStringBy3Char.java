import java.util.Scanner;

public class LeftRotateStringBy3Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s= sc.next();
        char[] a=s.toCharArray();
        int l=a.length;
        System.out.println("enter the number by which string to be rotated:");
        int n= sc.nextInt();
        for(int j=0;j<n;j++){
            char firstChar=a[0];
            for(int i=0;i<l-1;i++){
                a[i]=a[i+1];

            }
            a[l-1]=firstChar;
        }
        StringBuffer sb=new StringBuffer();
        for(char c:a){
            sb.append(c);
        }
        System.out.println("the string after "+ n+ " rotation is:"+sb);
    }
}
