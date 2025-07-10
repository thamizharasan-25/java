package C2Ctasks;

import java.util.Scanner;

//Write a program to reverse a given number and print
public class While1 {
    public static int rev(int n){
        int rev=0;
        while (n>0) {
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        sc.close();
        System.out.println(rev(num));
        
    }
}
