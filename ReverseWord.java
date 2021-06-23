import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s=sc.nextLine();
        String[] words=s.split(" ");
        List<String> l= Arrays.asList(words);
        Collections.reverse(l);
        for(String word:l){
            System.out.print(word +" ");
        }
    }
}
