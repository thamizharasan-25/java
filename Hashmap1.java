import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    //hash map is a dictonary like where we store the elements as key value pair
    //keys are unique
    // it is like set where the order will be not sorted
    public static void main(String[] args) {
        Map<Integer,String> cricscore=new HashMap<>();
        //hifh scores by each ipl team
        cricscore.put(225,"CSK");
        cricscore.put(260, "KKR");
        cricscore.put(264, "RCB");
        cricscore.put(222, "PBKS");
        //can replace
        System.out.println(cricscore.get(222));//print the value of key
        System.out.println(cricscore);//print entire key value pair
        //can replace the value with usinf same keys
        cricscore.put(264, "SRH");
        System.out.println("After replaceing 264"+"\n"+cricscore);
        for (Integer score : cricscore.keySet()) {//returns all keys 
            System.out.println(cricscore.get(score));
            //print key values one by one
        }

    }
}
