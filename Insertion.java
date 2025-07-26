public class Insertion {
    public static void main(String[] args) {
        int arr[]={5,12,2,5,4,1,5,62,4,8,9,10};

        for (int i = 1; i <arr.length; i++) 
        {//5 4 3 2 1
            int key=arr[i];
            int j= i-1;
            while(  j>0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;   
            }
            arr[j+1]=key;
        }
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
