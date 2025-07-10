package C2Ctasks;
//Write a program to check if a given integer number is odd or even.

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
    System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    sc.close();
    System.out.println(((a&1)==0?"even":"odd"));
    }
}
