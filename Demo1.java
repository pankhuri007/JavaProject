package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo1
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        System.out.println("enter a number:");
        int x=sc.nextInt();
        sc.close();
        System.out.println(n+x);

    }
}
