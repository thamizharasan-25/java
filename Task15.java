import java.util.Scanner;

public class Task15 {
    //Christmas Discount  
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the num");
                int n=sc.nextInt();
                sc.close();
                int sum=0,sum1=0,m;
                while (n>0) {
                    m=n%10;
                    if(m%2!=0) sum+=m;
                    else
                     sum1+=m;
                    n/=10;
                }
                System.out.println(sum*sum1);


    }
}
