package C2Ctasks;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet:");
        char ch=sc.next().charAt(0);
        sc.close();
        int ascii=(int)ch;
        
        if(ascii >=65 && ascii<=90)System.out.println((char)(ascii+32));
        else if(ascii >=97 && ascii<=122){
         //ascii-=32;
        // System.out.println(ascii);
            System.out.println((char)(ascii-32));
        }else System.out.println("not a Alphabet!!");
    }
}
