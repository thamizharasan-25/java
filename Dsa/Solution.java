package Dsa;

public class Solution {
    
    //optimized logic
    public  static int countHillValley(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(  nums[i]==nums[i-1])continue;
            int a=i-1;
            int val=nums[i];
            int c=i+1;
            while(a>=0 && nums[a]==val)
                a--;
            while(c<nums.length && nums[c]==val)
                c++;
            if(a>=0 && c<nums.length){
            if(val>nums[a] && val>nums[c] )count+=1;
            else if(val<nums[a] && val<nums[c])count+=1;
           }
        }
        return count;
        }

   

    // brute force logic
        //     if(nums[a]!=nums[b] && nums[b]!=nums[c]){
        //         if(nums[b]>nums[a] && nums[b]>nums[c] ){
        //              count+=1;
        //              }
        //         else if(nums[b]<nums[a] && nums[b]<nums[c]){
        //              count+=1;
        //     }
        // }
        //     else if(nums[a]==nums[b]){
        //         while(nums[a]==nums[b]){
        //             if(a<=0) break;
        //             a=a-1;
                    
        //         }
        //          if(nums[b]>nums[a] && nums[b]>nums[c] ){
        //              count+=1;
                    
        //              }
        //         else if(nums[b]<nums[a] && nums[b]<nums[c]){
        //              count+=1;
        //             }
        //     }
        //     else{
        //         while(nums[b]==nums[c]){
        //             if(c>nums.length-2) break;
        //             c=c+1;
                   
        //         }
        //         if(nums[b]>nums[a] && nums[b]>nums[c] ){
        //              count+=1;
                    
        //              }
        //         else if(nums[b]<nums[a] && nums[b]<nums[c]){
        //              count+=1;
                   
        //     }
        //  }
        
        // }


        public static void main(String str[]){
            int nums[]={2,4,1,1,6,5};
            System.out.println(countHillValley(nums));
        }
}
   

