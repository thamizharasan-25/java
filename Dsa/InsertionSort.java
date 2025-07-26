package Dsa;

import java.util.Scanner;

public class InsertionSort {
    public static void Insort(int arr[],int n){
        // for (int i = 0; i < n; i++) {
        //     int j=i;//5 4 3 2 1
        //     while (j>0 && arr[j-1]>arr[j]) {
        //         int temp=arr[j];
        //         arr[j]=arr[j-1];
        //         arr[j-1]=temp;
        //         j--;
        //     }
        // }

        //another logic by using a key and inserting at the correct index
        for (int i = 1; i < n; i++) {
            int j=i-1;//5 4 3 2 1 if i==1 then j=0
            int key=arr[i];//key=4
            while (j>=0 && arr[j]>key) { //5>4 ==> arr[1]=5 then j--
                arr[j+1]=arr[j];            
                j--;
            }
            arr[j+1]=key; //j=>-1 so -1+1 => 0=> arr[0]=4
            //like these it will loop upto n-1.
        }
    }
    public static void main(String[] args) {
        System.out.print("enter the n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Insort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    //time complexity ->O(n2) -worst case and Avg case && O(n)->best casef
}