package C2Ctasks;
//4. Write a program to print the sum of all the digits of a given number. 

import java.util.Scanner;

public class For4 {
    public static int sum(int n){
        int sum=0;
        while (n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println("sum of digits: "+sum(n));
        
    }
}
