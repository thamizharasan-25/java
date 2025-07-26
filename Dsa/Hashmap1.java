
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Hashmap1{
    public static void countfreq(int[] arr) {
        //tree map stores the data in sorted order 
        HashMap<Integer,Integer> count=new HashMap<>();
        //int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(count.containsKey(arr[i])){
                count.put(arr[i], count.get(arr[i])+1);
            }
            else{
                count.put(arr[i], 1);
            }

        }
        
        int max=0;
        int maxk=Integer.MAX_VALUE;
        int mink=0;
        int min=Integer.MAX_VALUE;
        for (HashMap.Entry<Integer, Integer> i : count.entrySet()) {
        //     System.out.println(i+":"+count.get(i));
        //     int n=count.get(i);
        //     if(n>max) {
        //         max=n;
        //         maxk=i;
        //     }
        //     if(n<min) {
        //         min=n;
        //     mink=i;
        // }
            int n=i.getKey();
            int f=i.getValue();
            // common logic to use the minimum number of equal frequencies
            if(f>max || f==max && n<maxk)// it has minimum key with more frequencies 
              {  max=f;
                maxk=n;
        }
            if (f<min ||f==min &&n>mink)// it has minimum freq of max key
             {
                min=f;
                mink=n;
            }
    }
        System.out.println("maxinum freq of "+maxk+" is "+max);
        System.out.println("minimum freq of "+mink+" is "+min);
        
        
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,2,2,1,1,9,89,99,9,1,2};
        countfreq(arr);
    }
    
}
