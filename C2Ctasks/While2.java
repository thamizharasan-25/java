package C2Ctasks;
import java.util.Scanner;

//Write a program to check palindrome a given number
public class While2 {
    public static String rev(int n){
        int rev=0;
        int temp=n;
        while (n>0) {
            rev=rev*10+n%10;
            n/=10;
        }
        if(rev==temp) return "palindrome";
        else return "Not a palindrome";
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        sc.close();
        System.out.println(rev(num));
        
    }
}

