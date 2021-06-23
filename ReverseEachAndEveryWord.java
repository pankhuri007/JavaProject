import java.util.Scanner;

public class ReverseEachAndEveryWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String:");
        String s= sc.nextLine();
        sc.close();
        String[] words=s.split(" ");
        String reversedString="";
        for(String word: words){
            String reverseWord="";
            for(int i=word.length()-1;i>0;i--){
                reverseWord=reverseWord+word.charAt(i);
            }
            reversedString=reversedString+reverseWord+" ";
        }
        System.out.println(reversedString);
    }
}
