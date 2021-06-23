import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hackerrank2 {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9]{7,29}");
        Matcher m=p.matcher(s);
        if(m.find() && m.group().equals(s)){
            System.out.println("Valid username");
        }
        else{
            System.out.println("Invalid username");
        }
    }
}
