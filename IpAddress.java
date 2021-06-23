import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IpAddress {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your website url:");
        String web= sc.nextLine();
        try
            {
                InetAddress ip=InetAddress.getByName(web);
                System.out.println(ip);
            }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        }


}
