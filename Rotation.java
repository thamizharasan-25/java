import java.util.Scanner;

public class Rotation {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the rotation:");
        int r=sc.nextInt();
        for (int i = 0; i < n; i++) {
            b[(r+i)%n]=arr[i];    
        }
        for (int i : b) {
            System.out.println(i);
            
        }
        sc.close();
        

}
}