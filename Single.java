import java.util.Scanner;

public class Single {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        // int unique=0;
        // for (int i = 0; i < n; i++) {
        //     unique= unique^arr[i];
        // }
        //     System.out.println(unique);
        //     sc.close();
       for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) { 
                System.out.println("Unique element: " + arr[i]);
                continue;
            }
        }
        sc.close();
        
        }
    }

            
    











        
       