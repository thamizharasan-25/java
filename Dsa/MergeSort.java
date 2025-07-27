package Dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void Msort(int arr[],int low,int high){
        if(low>=high) return ;
        int mid=(low+high)/2;
        Msort(arr, low, mid);
        Msort(arr, mid+1, high);
        Merge(arr,low,mid,high);
    }

    private static void Merge(int[] arr, int low, int mid, int high) {
        //two pointers
        //we used array for easy adding of data we can do using array also..
        //int temp[]=new int [high-low+1] bcoz we subarrays so the low should be minus from to get overall length
        //we need to use k=0 which is index of temp and we need to add the k to store the data in the arr[]
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high) {
            if (arr[left]<=arr[right]) {
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while (left<=mid) {
            temp.add(arr[left++]);
        }
        while (right<=high) {
            temp.add(arr[right++]);
            
        }
        for ( int i = low; i <=high; i++) { //if array is used we can use this loop or we can use loop from 0 to temp.length
            arr[i]=temp.get(i-low);            //and the arr[i+low] =temp[i] bcoz low can be anything which can be 2  
        }                                      //from that index of arr[] should be sorted ...
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Msort(arr, 0, n-1);
        System.out.println("sorted array:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    ///Time Complexity:Olog2(N)+O(N) => nlogn
    /// here the elements are sorted by divide into diff arrays where the n is dividing then the time complexity will be
    /// Olog2(N) and merging takes worst case of TC is O(N)
    
    /// Space complexity:O(n) ->worst case bcoz we using temp list in merge
}
