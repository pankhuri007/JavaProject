import java.util.Locale;
import java.util.Scanner;

public class CapitalizeFirstWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s= sc.nextLine();
        String[] words=s.split(" ");
        String finalStatement= "";
        for(String word:words){
            char[] ca=word.toCharArray();
            char c=ca[0];
            String firstChar=String.valueOf(c).toUpperCase();
            String capitalWord=firstChar;
            for(int i=1;i<ca.length;i++){
                capitalWord=capitalWord+ca[i];
            }
            finalStatement=finalStatement+capitalWord+" ";
        }
        System.out.println(finalStatement);
    }
}
