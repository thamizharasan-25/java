import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class cricketer{
        private int runs;
        private String name;
        cricketer(int runs,String name){
            this.name=name;
            this.runs=runs;
        }
        public String toString(){
            return name+" scored "+runs+" in 10 matches ";
        }
        public int getruns(){
            return this.runs;
        }
    }
public class Comparator2 {
    
 public static void main(String[] args) {
    //instead of using Integer we can use any class
    List <cricketer> cric=new ArrayList<>();
    Comparator <cricketer> comp=(i, j)->i.getruns()<j.getruns()? 1: -1;
    cric.add(new cricketer(400,"tamil"));
    cric.add(new cricketer(500,"Jeeva"));
    cric.add(new cricketer(300,"kanna"));
    cric.add(new cricketer(200,"sabari"));
    // for (cricketer c : cric) {
    //     System.out.println(c);
    // }
    //now we cant do the collection of sort where so we sort using the runs scored by each batsman by using comparator
    Collections.sort(cric,comp) ;
    for (cricketer c : cric) {
        System.out.println(c);
    }
    
    
 }   
}
