public class Jaggedarray {
    public static void main(String[] args) {
        int nums[][]=new int[3][];//jagged array means it has diffent size of colums
        nums[0]=new int[4];
        nums[1]=new int[3]; 
        nums[2]=new int[2];

        for (int i = 0; i <nums.length ; i++) {// if we use nums.length it takes only row size in the condition
            for (int j = 0; j < nums[i].length; j++) {//i represents the size of  colums in a row
                nums[i][j]=(int)(Math.random()*10);
                //we use math lib and random() gives only double value like 0.2344,0.3554
                //so we typecasted to int and multiplied by 10 to get single digit values 
            }
        }
        for (int[] n : nums) { // n contains each row as a 1D array like n[0]=1,2,3,4
            for (int m : n) {// m contains each element in the array
                System.out.print(m+" ");
            }
            System.out.println();
            
        }
    }
}
