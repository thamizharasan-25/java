import java.util.Scanner;
//Transmit Data  

public class Task13 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("enter the num:");
        int num=sc.nextInt();
        int rev=0;
        while (num>0) {
            rev=rev*10 + (num%10);
            num/=10;
        }
        System.out.println(rev);
        sc.close();
    }

}
