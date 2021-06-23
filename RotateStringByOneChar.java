import java.util.Scanner;

public class RotateStringByOneChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s= sc.next();
        char[] c=s.toCharArray();
        char firstChar=c[0];
        int sz=c.length;
        for(int i=0;i<sz-1;i++){
            c[i]=c[i+1];

        }
        c[sz-1]=firstChar;
        StringBuffer b=new StringBuffer();
        for(char x:c){
            b.append(x);
        }
        System.out.println("the string after rotation is:"+b);
    }
}
