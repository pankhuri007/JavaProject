import java.util.Scanner;

public class ReplaceSpecialCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s=sc.nextLine();
        sc.close();
        String s1=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}
