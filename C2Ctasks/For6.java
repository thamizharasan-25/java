package C2Ctasks;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        System.out.print("enter the num:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for (int  i = 1; i <= n; i++) {

            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
    
}
