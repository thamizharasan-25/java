import java.util.Scanner;

public class Task21 {
    //Pooled Cab Services 
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the n and range");
                int n=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();
                int arr[]=new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i]=sc.nextInt();
                    if (arr[i]>a && arr[i]<b) {
                        System.out.print(arr[i]+" ");
                    }
            
            }
sc.close();
    }
}
