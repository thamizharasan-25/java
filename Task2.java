import java.util.Scanner;
    //Sum of Adjacent Distances
public class Task2 {
    public static void main(String[] args) {
        int n,i;
        int sum=0;
        int ans=0;
         System.out.print("enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if (n < 2) {
            System.out.println("Need at least two numbers to calculate differences.");
            sc.close();
            return;
        }
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
                }
                
        for(i=0;i<n-1;i++){
                sum=((arr[i]-arr[i+1]));
                sum=Math.abs(sum);
                ans=ans+sum;
            
        }
        System.out.println(ans);
        sc.close();
    }
}
