package com.company;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char c=sc.next().charAt(0);
        sc.close();
        boolean isVowel=false;
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'E':
            case 'O':
            case 'U': isVowel=true;
        }
        if(isVowel){
            System.out.println(c + " is a vowel");
        }else{
            System.out.println(c + " is not a vowel");
        }
    }
}
