import java.util.Scanner;
public class Task6 {
    //Garments Company Apparel
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n,count=0;
    System.out.println("enter the n:");
    n=sc.nextInt();
    int arr[]=new int[n];
    if (n>0&&n<106) {
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
        double sqr=Math.sqrt(arr[i]);
        int sq=(int)sqr;//type casting from double to int
       //System.out.println(sq);
        if (sq*sq == arr[i]) count+=1;
    }
    System.out.println(count);
}
sc.close();
}
}

/* we can also use this logic without any inbuilt functions
   int numOfPlots = sc.nextInt();
        int count = 0;

        for (int i = 0; i < numOfPlots; i++) {
            int area = sc.nextInt();

            // Check if area is a perfect square
            for (int j = 1; j * j <= area; j++) {
                if (j * j == area) {
                    count++;
                    break; // once we know it's a square, move to next plot
                }
            }
        }

        // Output: number of square plots
        System.out.println(count);
 */