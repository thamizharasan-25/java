import java.util.Scanner;

public class Rangesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("enter the i j");
        i=sc.nextInt();
        j=sc.nextInt();
        int range=0;
         if(i>=0 && i<=9999 && j>=0 && j<=9999 && i!=j){
        for (int sum=i; sum<=j ; sum++) {
            range+=sum;
           // System.out.println(sum);
        }
        System.out.println(range);}
        else
            System.out.println("Invalid Input");
        sc.close();
    }
}
