import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character");
        char c=sc.next().charAt(0);
        int av=(int)c;
        System.out.println(av);
    }
}
