import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Collection <Integer>nums=new HashSet<Integer>();
        //it is the hashset where  no sequence and stores unique elements only
        nums.add(10);
        nums.add(542);
        nums.add(45);
        nums.add(70);
        //for each for nums
        for (Integer num : nums) {
            System.out.println(num);
        }
        System.out.println(nums);// it stores the elements in sorted order .
         Set <Integer> nums1=new TreeSet<Integer>();
         nums1.add(45);
         nums1.add(07);
         nums1.add(18);
         nums1.add(8);
         System.out.println(nums1);
         //using iterable in set which is also a extended interface of collection
        Iterator <Integer> val=nums.iterator();
        System.out.println(val.hasNext()); //has.next() it returns true if next value is persent 
        while (val.hasNext()) {
            System.out.println(val.next());// it moves the value of by next
        }

    }
}
