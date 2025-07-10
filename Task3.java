import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        System.out.print("enter n numbers:");
        n=sc.nextInt();
        int tot[]=new int[n];
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if (arr[i]%2==0) {
                tot[c]=arr[i];
                arr[i]=0;
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]>0) {
                tot[c]=arr[i];
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(tot[i]+" ");
        }
sc.close();
    }
}
