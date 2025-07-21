import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreanApi {
    //stream is interface which has more methods..
    //but a many of stream methods return only stream objects and it can used only one time.

    public static void main(String[] args) {
        List <Integer> nums=Arrays.asList(1,2,3,4,5,8,9);
        
        // we can use as many methods in a single line
        int res=nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (c,e)->c+e);
        Stream<Integer> s1=nums.stream();

        // gives runtime exception  when the two print is used where s1 is used for only one time.and the 2nd time gives exception
        s1.forEach(n->System.out.println(n));
        //s1.forEach(n->System.out.println(n));
        System.out.println(res);

    }
/*  UNCOMMENT TO UNDERSTAND HOW THESE METHODS ARE WORKING!!!\

    //explanation version of .filter(), .map() , .reduce() , .sorted() .
    public static void main(String[] args) {
        List <Integer> nums=Arrays.asList(1,2,3,4,5,8,9);
        Stream<Integer> s1=nums.stream();
        // predicate is a interface which is implmented in filter()
        //@FunctionalInterface
        Predicate<Integer> p=new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n%2==0; //due it returns bool so no need of more conditons
            } 
        }; 
        // it can be modified in lambda as p= n-> n%2==0;

        //Function is a  which is implmented in map()
        Function <Integer,Integer> m=new Function<Integer,Integer>() {
            public Integer apply(Integer n) {
               n=n*2;
               return n;
            }// it can be rewrited using lambda => m= n-> n*2; 
        };

        //same like these methods were written in the above main methods so it is the explain of the where the two works like same
        int res=nums.stream().filter(p).map(m).reduce(0, (c,e)->c+e);
        System.out.println(res);
        Stream <Integer> sortedval=s1.filter(n->n%2!=0).sorted();
        sortedval.forEach(n->System.out.println(n));
        //.sorted() it sorts the stream values
*/
    }    
}
