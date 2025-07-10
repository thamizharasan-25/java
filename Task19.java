import java.util.Scanner;

public class Task19 {
    //Gift hampers to winners  
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.print("enter the n:");
                int n=sc.nextInt();
                int k=sc.nextInt();
                int arr[]=new int[n];
                int count=0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i]=sc.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n ; j++) {
                    if ((arr[i]-arr[j])==k) {
                        count+=1;
                    }
                }}
                System.out.println(count);
                sc.close();

    }
}
