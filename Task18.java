import java.util.Scanner;

public class Task18 {
    //Special Discount  
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the n and discount");
                int n=sc.nextInt();
                int count=0;
                int dis=sc.nextInt();
                int arr[]=new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i]=sc.nextInt();
                    if (dis%arr[i]==0&& arr[i]>=dis/2){
                        count+=1;
                    }
                }
                System.out.println(count);
                sc.close();

    }
}
