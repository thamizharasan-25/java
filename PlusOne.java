public class PlusOne {
    //66.leetcode
    
    public int[] plus1(int arr[]){
        for (int i =arr.length-1 ; i >=0 ; i--) {//we looping from backwards
            if(arr[i]<9){
                arr[i]++;
                return arr; //if one digits is from last is <9 then add 1 then return the arr.
            }
            arr[i]=0;//where if !<9 then it should be 9 that should be added as 0 and and 6<9 then it then in nxt loop 6 bcoms 7 then breaks. 
        }
        //if arr is {9,9,9,9} then all 9 becomes 0 so we need to add 1 at 0 index.
        arr=new int[arr.length+1];
        arr[0]=1;
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={9};
        PlusOne p1=new PlusOne();
        //we should add one to the last digit and if ld is 9 then then it should return [1,0]
        for (int i : p1.plus1(arr)) {
            System.out.print(i+" ");
        }

    }
}
