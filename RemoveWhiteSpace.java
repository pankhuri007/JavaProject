import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String s=sc.nextLine();
        String s1=s.replaceAll("\\s","");
        System.out.println(s1);
    }
}
