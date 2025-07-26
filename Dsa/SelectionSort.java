package Dsa;

import java.util.Scanner;

public class SelectionSort{
    public static void SSort(int arr[],int n){
                //int j=0;
        for (int i = 0; i <= n-2; i++) {
            int min=i;
            for (int  j = i; j <= n-1; j++) {
                if(arr[j]<arr[min]) 
                {
                    min=j;
                }
        }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("enter the n:");;
        int n=5;
        int arr[]=new int[n];
        Scanner sc=new Scanner(System.in);   
        n=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        SSort(arr,n);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
    // time complexity is O(n2) for every case
}