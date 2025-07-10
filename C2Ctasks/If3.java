package C2Ctasks;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        System.out.print("enter the characters:");
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        sc.close();
        // if(ch1>ch2){
        //     System.out.println(ch2 +" "+ ch1);
        // }else System.out.println(ch1 +" "+ ch2);
        System.out.println((ch1>ch2)?(ch2 +" "+ ch1):(ch1 +" "+ ch2));

    }
}
