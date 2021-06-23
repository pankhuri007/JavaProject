import java.util.Scanner;

public class Perimeter {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius of a circle:" );
        double r= sc.nextDouble();
        double pi=Math.PI;
        double p=2*r*pi;
        System.out.println(p);
    }
}
