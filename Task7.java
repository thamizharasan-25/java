import java.util.Scanner;
public class Task7 {
    //Bucketize Ids
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the IDs:");
        int n=sc.nextInt();
        int max=0;
        while (n>0) {
            int temp=n%10;
            if (max<temp) {
                max=temp;
            }
            n/=10;
        }
        System.out.println(max);
        sc.close();
    }
}
