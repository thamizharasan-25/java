package C2Ctasks;

import java.util.Scanner;

public class For5 {
    public static void floyds(int n){
        int i=1;
        for (int j = 0; j < n; j++) {
            for (int j2 = 0; j2 <=j; j2++) {
                System.out.print(i++ +" ");
            }
                System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int num=sc.nextInt();
        sc.close();
        floyds(num);
    }
    
}
