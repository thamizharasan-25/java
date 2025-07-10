public class Multidarray {
    public static void main(String[] args) {
        int nums[][]=new int[3][4];
        // 3 rows 4 coloums
        //using random to assign random values
        for (int i = 0; i <nums.length ; i++) {// if we use nums.length it takes only row size in the condition
            for (int j = 0; j < nums[i].length; j++) {//i represents the size of  colums in a row
                nums[i][j]=(int)(Math.random()*10);
                //we use math lib and random() gives only double value like 0.2344,0.3554
                //so we typecasted to int and multiplied by 10 to get single digit values 
            }
        }
        for (int[] n : nums) {
            for (int m : n) {
                System.out.print(m+" ");
            }
            System.out.println();
            
        }
    }
}
