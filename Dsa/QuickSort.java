package Dsa;

import java.util.Scanner;

public class QuickSort {
    //it arranges in ascending order
    //same like merge sort where use a pivot element and using that we seperate the elements small on left and greater on right
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Qs(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void Qs(int[] arr, int low, int high) {
        if(low<high){
            int pindex=Qsort(arr,low,high);
            Qs(arr,low, pindex-1);
            Qs(arr,pindex+1, high);
            //same recursive like merge sorting
        }

    }

    private static int Qsort(int[] arr, int low, int high) {
        int i=low +1,j=high;
        int pivot=arr[low];

       while (i<j) {
        while (i<=high && arr[i]<=pivot  ) {
            i++;
            
        }
        while (j>=low && arr[j]>pivot ) {
            j--;
        }
        if (i < j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
    }

        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        
    return j;

    }
    //TC =>nlogn (same as merge sort)
    //SC=>O(1) due to recursion
}
