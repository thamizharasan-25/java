package C2Ctasks;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        System.out.print("Enter the input:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        //System.out.println(ch);
        if(Character.isDigit(ch)) System.out.println("Digit");
        else if(Character.isAlphabetic(ch)) System.out.println("Alphabet");
        else System.out.println("Special character");
        sc.close();
        // if(!Character.isLetterOrDigit(ch)) System.out.println("special");
        // else{
        // if (Character.isLetterOrDigit(ch)) System.out.println("true");
        // else System.out.println("False");
        // }
        }
    }
    /*String str = "Hello";
if (str.matches("[a-zA-Z]+")) {
    System.out.println("Only alphabets");
}
 */
//}
