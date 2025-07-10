//here the multiple interface can be implemented in one class which is cant done by the abstract class
 interface batsman {
        void type(String str);
    
}
interface captain {
    void name(String str);
}
/*  interface bowler extends batsman{
we can inherit the interface also..here in the class the bowler can be given 
instead of the batsman Bcause it inherited it.
 }*/
class team implements batsman,captain{ // two interfaces has implemented in the single class
    public void type(String str){
        System.out.println("I am "+str+" Batsman");
    }
    public void name(String name){
        System.out.println("I am "+name+" captain of the Team ");
    }
}


public class Interface3 {
    public static void main(String[] args) {
        team T1=new team();     //we can use interface as a reference type
        String name="Thamizarasan";//if we used the nterface as a reference type when the interface is inherited then we need to create another object
        String str="Right Hand";        //for the another interface which is inherited..
        T1.type(str);
        T1.name(name);

        
    }
    
}
