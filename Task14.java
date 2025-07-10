import java.util.Scanner;
//Maximum Energy in Science Lab 

public class Task14 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n:");
    int n=sc.nextInt();
    int sum=0;
    int arr[]=new int[n];
    for (int i = 0; i < n; i++){ 
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
    sc.close();
    System.out.println(sum);


}

}
