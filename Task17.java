import java.util.Scanner;

public class Task17 {
    //Digital Secure Data Transfer 
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n;
                char ch;
                System.out.println("enter the char and num");
                ch=sc.next().charAt(0);
                n=sc.nextInt();
                System.out.printf("%c\n",(ch+n));
                sc.close();
    }
}
