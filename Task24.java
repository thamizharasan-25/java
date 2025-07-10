import java.util.Scanner;
//Encode as Number
public class Task24 {
    public static void main(String[] args) {
        int num,a;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        a=sc.nextInt();
        int count=0;
        while (num>0) {
            if (num%10 == a) {
                count++;
            }num/=10;
        }
        System.out.println(count);
        sc.close();
}}
