public class D3_array {
    public static void main(String[] args) {
        int nums[][][] = new int[5][4][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) 
                for (int k = 0; k < nums[i][j].length; k++) 
                    nums[i][j][k]=(int)(Math.random()*10);
        } 
        for (int[][] n : nums) {
            for (int[] m : n) {
                for (int  o : m) {
                    System.out.print(o+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(nums[0][1][2]);//it prints the value of 1st row 2 colum 3 element
    }
}
// 0 8 0  0 4 1  0 5 4  1 5 8  this will be the structure of the 3d array of the above code 
// 8 5 8  0 3 7  8 5 4  8 2 0  5 rows
// 0 8 4  5 2 9  8 4 8  0 5 7  4 coloums
// 4 4 0  6 8 5  2 3 4  9 2 7  3 elements in each colums
// 4 7 7  5 5 6  0 7 2  3 4 5  
