package com.company;
import java.util.Scanner;

public class Mtable
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            int s=n*i;
            System.out.println(n+"*"+ i +"="+s);
        }
    }
}
