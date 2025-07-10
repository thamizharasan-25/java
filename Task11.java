import java.util.Scanner;

public class Task11 {
    //New Year Discount  

    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the bill");
                int n=sc.nextInt();
                sc.close();
                int sum=0,m;
                while (n>0) {
                    m=n%10;
                    if(m%2!=0) sum+=m;
                    n/=10;
                }
                System.out.println(sum);


    }
}
