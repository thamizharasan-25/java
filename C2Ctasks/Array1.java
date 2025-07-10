package C2Ctasks;

public class Array1 {
    public static void sum(int arr[]){
       int sum=0;
        
            for (int n : arr) {
                sum=sum+n;
            }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+(sum/arr.length));
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        sum(arr);
    }
}
