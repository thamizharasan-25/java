package C2Ctasks;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
    System.out.print("enter the count:");
    Scanner sc=new Scanner(System.in);
   int count=sc.nextInt();
   sc.close();
    int i=1;
    while(count>0){
        if(i%2==0 && i%3==0 && i%5==0){
            System.out.print(i+" ");
            count--;
        }
         i++;

    }
}
 }
