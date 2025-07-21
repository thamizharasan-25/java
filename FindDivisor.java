import java.util.ArrayList;
import java.util.Collections;

public class FindDivisor {
    public static void main(String[] args) {
        int n=11;
        //to sort this we use list
        ArrayList<Integer> ls=new ArrayList<>(); 
        int count=0;
        for (int i = 1; i*i<=n; i++) {  //we use <=sqrt(n) bcoz perfectsquare miss 1 loop 
            // System.out.println(Math.sqrt(n));
            if (n%i==0) {
                count++;
                ls.add(i);
                if(n/i!=i){
                ls.add(n/i);
               count++; }
            }
        }
        if(count==2) System.out.println("prime number");
        else System.out.println("Not a prime number");
        Collections.sort(ls);
        System.out.println(ls);
    }
}
