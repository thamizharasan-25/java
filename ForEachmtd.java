import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachmtd {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,35,6,7,8);     
        // while creating arraylist we can initiate values by Arrays have a mtd called asList()
        nums.forEach(n -> System.out.println(n));
    /*forEach is a method in iterable where it implement a interface called consumer which has a method and
     It actually gives values ine by one we can do any operation like printing ,adding,doublibg,etc..
    here we gonna create the consumer interface for adding the values of nums */
        int sum=5;
        //functional Interface so ->
        System.out.println("adding each values by 5");
        Consumer <Integer> con=(Integer n)-> System.out.println(sum+n);
        nums.forEach(con);//instead of using con ,we use the same lambda expression in foreach inside itself
    }
}
