import java.util.Scanner;

public class Two{
    
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n value:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int b[]=new int[n];
        int j=0,count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if (arr[i]!=0) {
               b[j]=arr[i];
               j++;
            }
            else
               count+=1; 
        }
        if(count>0){
        for (int i = 0; i < count; i++) {
            b[j]=0;
            j++;
        }
    }
        for (int i : b) {
            System.out.print(i+" ");
        }
        sc.close();
}
}