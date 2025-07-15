import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class ArrayList1 {
    ///here we are gonna use collections where it is a interface where we cant create the obj for that and it contains more methods .
    /// so we use the ArrayList which is a class implements the List interface which is extends the collection interface
    
    //Collection nums=new ArrayList();
    //instead of using collection as ref type we can use List as ref type bcoz it has more methods which can be used .
    //in collection the index cant be accessed in the ArrayList(), so we use List as ref type
public static void main(String[] args) {
    

    List<Integer> nums=new ArrayList<Integer>();
    // we can use the any wrapper class or we can use without the wrapper where it can be come any runtime exception if other dataype is entered
    nums.add(25);
    nums.add(15);
    nums.add(26);
    nums.add(15);
    //to print each value we cant use index values without get() so we use for each
    for (Integer n : nums) {
        System.out.println(n);
    }

    System.out.println(nums);//it can print all the values
    System.out.println(nums.get(1));//it can use index
    System.out.println(nums.size());//it prints size
    System.out.println(nums.indexOf(15));//give index value of the value
}
// so there are different which is very useful to use in complex problems make effient 
}
