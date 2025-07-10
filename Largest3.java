import java.util.Scanner;

public class Largest3 {
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n:");//getting n values
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int l1=0,l2=0,l3=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==l1 || arr[i]==l2 ||arr[i]==l3) continue;
            if (arr[i]>l1) {
                l3=l2;
                l2=l1;
                l1=arr[i];}
                else if(arr[i]>l2){
                    l3=l2;
                    l2=arr[i];}
                else if (arr[i]>l3) {
                        l3=arr[i];
                    }
}           
            for (int j = 0; j < n; j++) {
            if(arr[j]==l3) count+=1;
        }if(count==0) System.out.println("Array not consist of less than 3 largest number");
        System.out.println(l1+" "+l2+" "+l3);
        sc.close();

}}