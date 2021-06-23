
import java.util.Scanner;

public class Hackerrank1 {
     static   boolean  isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean f=false;
        char[] c=a.toCharArray();
        java.util.Arrays.sort(c);
        char[] d=b.toCharArray();
        java.util.Arrays.sort(d);
        String s1=new String(c);
        String s2=new String(d);
        if(s1.equals(s2)){
         f=true;
        }
        return f;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b= sc.next();
        sc.close();
      boolean  ret = isAnagram(a,b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
 }
