import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nlargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n:");//getting n values
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        List<Integer>uni=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
         System.out.println("enter the nth value:");
         int  m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            temp=0;
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    temp+=1;
                    break;
                }
            }
            if (temp==0) {
             uni.add(arr[i]);
            }
        }
        if (uni.size()>=m) {
        for (int j = 0; j < m; j++) {
            temp=0;
         int max=0;
         for (int i = 0; i < uni.size(); i++) {
               //System.out.println(uni);
                if (temp<uni.get(i)) {
                    temp=uni.get(i);
                    max=i;
                }
         }
             uni.set(max,0); 
        
        }
        System.out.println(temp);
        }
        else  System.out.println("NO OUTPUT");
        sc.close();
    }
}