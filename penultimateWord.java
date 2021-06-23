import java.util.Scanner;

public class penultimateWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String s= sc.nextLine();
        String[] words=s.split(" ");
        String penultimate="";
        if(words.length>1){
            penultimate=words[words.length-2];
            System.out.println(penultimate);
        }
        else{
            System.out.println("no penultimate can be found");
        }
    }
}
