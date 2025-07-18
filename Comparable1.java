
    // in compaarator2 for sorting the class we need a comparator that contains logic
    // instead we have the same logic in the class itself where we no need of comparator

    // Integer cls has implents a interface called comparable which has method called compareTo which gets objects as input for sorting.so we write logic in that and make it use.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class cricketer implements Comparable<cricketer>{
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

        public int compareTo(cricketer that) {
            if (this.getruns()<that.getruns()) {
                return 1;
            }else{
                return -1;
            }
            }
        }
    public class Comparable1 {
        public static void main(String[] args) {
            List <cricketer> cric=new ArrayList<>();
    cric.add(new cricketer(400,"tamil"));
    cric.add(new cricketer(500,"Jeeva"));
    cric.add(new cricketer(300,"kanna"));
    cric.add(new cricketer(200,"sabari"));
    Collections.sort(cric) ;
    for (cricketer c : cric) {
        System.out.println(c);
    }
        }
    }

