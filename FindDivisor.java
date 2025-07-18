import java.util.ArrayList;
import java.util.Collections;

public class FindDivisor {
    public static void main(String[] args) {
        int n=66;
        //to sort this we use list
        ArrayList<Integer> ls=new ArrayList<>(); 
        for (int i = 1; i <=Math.sqrt(n); i++) {  //we use <= bcoz perfectsquare miss 1 loop 
            // System.out.println(Math.sqrt(n));
            if (n%i==0) {
                ls.add(i);
                if(n/i!=i)ls.add(n/i);
            }
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
}
