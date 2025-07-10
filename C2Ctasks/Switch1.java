package C2Ctasks;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        ch=Character.toUpperCase(ch);
        switch (ch) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break; 
            case 'W':
                System.out.println("White");
                break;  
            default:
            System.out.println("use only provided code!!");
                break;
        }
    }
}
