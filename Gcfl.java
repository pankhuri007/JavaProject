import java.util.Scanner;

public class Gcfl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s=sc.nextLine();
        int n=s.length();
        char[] a=s.toCharArray();
        int[] b=new int[n];
        int[] f=new int[n];
        char p=s.charAt(0);
        f[0]=(int)s.charAt(0)-96;
        b[0]=1;
        for(int i=0;i<a.length;i++){
            if(a[i+1]!=a[i]){
                b[i]=1;
                p=s.charAt(i);
                f[i]=(int)p-96+b[i];
                System.out.println(f[i]);
            }
            else{
                b[i]=b[i-1]+1;
            }
        }

    }
}
