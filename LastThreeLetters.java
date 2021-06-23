import java.util.Scanner;

public class LastThreeLetters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String s= sc.nextLine();
        char[] c=s.toCharArray();
        int l=c.length;
        String lastElement="";
        for(int i=l-1;i>l-4;i--){
            lastElement=c[i]+lastElement;
        }
        System.out.println(lastElement);

    }
}
