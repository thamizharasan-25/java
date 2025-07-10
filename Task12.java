import java.util.Scanner;

public class Task12 {
    //Energy in Science Lab  

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[3];
        System.out.print("enter the initial energy,rate ,time:");
        for (int i = 0; i < 3; i++)
            arr[i]=sc.nextInt();
        for (int i = 0; i < 2; i++) {
            arr[i+1]=arr[i]*arr[i+1];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    sc.close();}
}
