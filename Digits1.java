import java.util.Scanner;
//It is a simple logic for the digits.java
public class Digits1 {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int mink=9,maxh=0,mint=9,maxu=0;
     System.out.println("Enter the numbers");
     for (int i = 0; i < 3; i++) {
        int num=sc.nextInt();
        int unit=num%10;
        num/=10;
        int tens=num%10;
        num/=10;
        int hund=num%10;
        num/=10;
        int thous=num%10;
        num/=10;
        if (unit>maxu) maxu=unit;
         if (tens<mint) mint=tens; 
         if (hund>maxh) maxh=hund;
          if (thous<mink) mink=thous;    
        }
        System.out.println(mink*1000+maxh*100+mint*10+maxu);
        sc.close();
     }
}
