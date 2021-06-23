package com.company;
import java.util.Scanner;

public class Leap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int n=sc.nextInt();
        boolean isLeapYear=false;
        if(n%4==0) {
            if (n % 100 != 0) {
                if (n % 400 == 0) {
                    isLeapYear = true;
                } else{
                    isLeapYear=false;
                }
            }else{
                isLeapYear=true;
            }
        } else{
            isLeapYear=false;
        }
        if(isLeapYear){
            System.out.println("Given year is a leap year");

        }else{
            System.out.println("Given year is not a leap year");
        }
    }
}
