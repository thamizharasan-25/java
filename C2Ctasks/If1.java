package C2Ctasks;
import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        if(a>0)System.err.println(" Positive Number");
        else if(a==0) System.out.println("Zero");
        else System.out.println("Negative Number");
        sc.close();
    }
}
