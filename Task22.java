import java.util.Scanner;

public class Task22 {
    //Sales Report  
     public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the m & n");
                int m=sc.nextInt();
                int n=sc.nextInt();
                int max[] = new int[m];
                max[0]=0;
                int arr[][]=new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j]=sc.nextInt();
                        if(max[i]<arr[i][j]) max[i]=arr[i][j];
                    }
                    
                }
                for (int i = 0; i < m; i++) {
                    System.out.print(max[i]+" ");
                }
sc.close();

    }
}
