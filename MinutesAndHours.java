import java.util.Scanner;

public class MinutesAndHours {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number of seconds::");
         int n=sc.nextInt();
         int minutes=n/60;
         int remainingSeconds=n%60;
         int hours=minutes/60;
         int remainingMinutes=minutes%60;
        System.out.println(hours+":"+remainingMinutes+":"+remainingSeconds);
    }
}
