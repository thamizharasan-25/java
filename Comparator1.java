import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1{
    public static void main(String[] args) {
        List <Integer> nums=new ArrayList<>();
        //comparator is functional interface so we use anonymous class
        // Comparator <Integer> comp=new Comparator<Integer>(){
        //     public int compare(Integer i,Integer j){
        //        if(i%10>j%10){
        //         return 1;//if return 1 then do swap
        //        } else return -1; //no swap
        //     }
        //    };

        //using lambda expression
         Comparator <Integer> comp=(i,j)->i%10>j%10?1:-1;
        nums.add(07);
        nums.add(15);
        nums.add(26);
        nums.add(81);
        Collections.sort(nums);  //Collections is a class where it contains more methods like sort
        
        System.out.println("Collections sort without comparator:\n"+nums);
        //if we want to use our own logic there is a comparator where it used to swap values
    System.out.println("sorted by unit digits ");
        Collections.sort(nums, comp);
        System.out.println(nums);
    }
}
