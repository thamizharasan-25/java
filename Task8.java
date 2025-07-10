import java.util.Scanner;
public class Task8 {
    //Bingo – Online Lottery Game 
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n,max=0,sum=0;
    System.out.println("enter the n:");
    n=sc.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < n; i++) 
        arr[i]=sc.nextInt();
    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j <n ; j++) {
            if(i==j) continue;
            if (arr[i]*arr[j]>max) {
                max=arr[i]*arr[j];
                sum=arr[i]+arr[j];
            }
        }
    }
    System.out.println(sum);
    sc.close();
}
}