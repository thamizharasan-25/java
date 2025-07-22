package DSA;
/// reversing the array
public class Recursion3 {
    //two pointer recursion
    public static void RevArray(int arr[],int l,int r){
        if(l>=r) return ;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
        RevArray(arr,l,r);
    }
    //one pointer recursion
    public static void RevArray2(int arr[],int l,int n){
        if(l>=n/2) return ;
        int temp=arr[l];
        arr[l]=arr[n-1-l];
        arr[n-1-l]=temp;
        RevArray2(arr,l+1,n);
    }
    
    public static void main(String[] args) {
        int arr[]={1,5,2,6,4,9};
        int l=0;
        int r=arr.length-1;
        RevArray(arr,l,r);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int n=arr.length;
        int arr1[]={1,5,2,5,6,3};
        System.out.println("one pointer");
        RevArray2(arr1, l, n);
        for (int i : arr1) System.out.print(i+" ");
        System.out.println();
    }
}
