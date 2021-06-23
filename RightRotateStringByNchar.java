import java.util.Scanner;

public class RightRotateStringByNchar {
    public static  void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String s= sc.nextLine();
        char[] a=s.toCharArray();
        int l= a.length;
        System.out.println("enter the number by which string is rotated:");
        int n= sc.nextInt();
        for(int j=0;j<n;j++){
            char lastChar=a[l-1];
            for(int i=l-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=lastChar;

        }
        StringBuffer sb=new StringBuffer();
        for(char c:a){
            sb.append(c);
        }
        System.out.println("the string after "+ n + " rotation is : "+sb);
    }
}
