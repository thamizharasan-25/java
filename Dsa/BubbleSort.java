package Dsa;

import java.util.Scanner;

public class BubbleSort {
    public static void BBsort(int arr[],int n){
        //my logic
        // for (int i = 0; i < n-1; i++) {
        //          int isswap=0
        //     for (int j = 0; j < n-1-i; j++) {
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //              isswap=1;
        //         }
        //     }
        //         if(isswap==0) break;
        // }

        //striver logic
        for (int i = n-1; i >=1; i--) {
            int isswap=0;
            for (int j = 0; j < i; j++) { //j<=i-1 is also correct
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswap=1;
                    //if no swap happened then it is sorted so no need next iteration which makes it optimized
                }
            }
            if(isswap==0) break;
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
        BBsort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    //Time complexity O(n2) ->worst /Avg complexity && O(n) ->best case by optimizing it
}
