import java.util.Scanner;
public class Task4 {
    //One Time Password
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int min=0,max=0;
        if (a<b && a>-109 && b<109) {
            for (int i = a; i <= b; i++) {
                int c = 0; // Reset for each i
                for (int j = 2; j <=i/2 ; j++) {
                    if (i%j==0) {
                        c=1;
                       break;  
                    }
                }
            if(c==0){
                if (min>i) min=i;
                max=i;
                }
            }sc.close();
        if (min==0 && max==0) System.out.println("No prime numbers in range.");
       else System.out.println(Math.abs(min+max));
            
         }//System.out.println(min);
        // System.out.println(max);
        
    }
}
