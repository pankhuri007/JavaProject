import java.util.Scanner;

public class AreaP {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of a rectangle");
        System.out.println("enter width of a rectangle");
        int l=sc.nextInt();
        int w= sc.nextInt();
        sc.close();
        int area=l*w;
        int perimeter=2*(l*w);
        System.out.println(" area= " + area + " perimeter= " + perimeter);
    }
}
