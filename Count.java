import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s=sc.nextLine();
        int ch1=0;
        int d=0;
        int sp=0;
        int cp=0;
        char[] ch=s.toCharArray();
        for(Character c:ch){
            if(Character.isLetter(c)){
                ch1++;
            }
           else if(Character.isDigit(c)){
                d++;
            }
            else if(Character.isSpaceChar(c)){
                sp++;
            }
            else{
                cp++;
            }
        }
        System.out.println(ch1);
        System.out.println(d);
        System.out.println(sp);
        System.out.println(cp);

    }
}
