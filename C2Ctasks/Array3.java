package C2Ctasks;

//import java.util.Arrays;

public class Array3 {
    public static int binarysearch(int arr[],int l,int r,int target){
        int mid=(l+r)/2;
        if(l<=r){
        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) return binarysearch(arr, mid+1, r, target);
        else if (arr[mid]>target) 
            return binarysearch(arr, l, mid-1, target);
        
    }
     return -1;
    }
    public static int linearsearch(int arr[],int target){
        for ( int i=0 ;i< arr.length;i++) {
            if(arr[i]==target) 
            { 
                return i;
        }
    }return -1;
}
public static void main(String[] args) {
    int arr[]={1,5,25,6,48,9,34,4,5};
    //Arrays.sort(arr);
    //System.out.println(binarysearch(arr, 0, arr.length-1, 25));
    System.out.println(linearsearch(arr, 25)>-1?"target found on index "+linearsearch(arr, 25):"no target found in array");
    
}    
}
