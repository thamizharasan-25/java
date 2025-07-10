package C2Ctasks;

public class Array4 {
    public static void main(String[] args) {
        int arr[]={1,2,34,56,86,85,24,1,2,4};
        int temp[]=new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate=false;
            for (int j = 0; j < count; j++) {
                if(arr[i]==temp[j]){
                    duplicate=true;
                    break;
                }
            
            }
            if (!duplicate) {
                temp[count]=arr[i];
                count++;
            }
        }
        for (int i =0 ;i<count;i++) {
            System.out.print(temp[i] +" ");
        }
    }
}
