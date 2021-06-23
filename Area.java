package com.company;
import java.util.Scanner;

public class Area {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of a cricle:");
        double r=sc.nextDouble();
        double pi=Math.PI;
        double area=pi*r*r;
        sc.close();
        System.out.print(area);
    }
}
