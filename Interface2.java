 interface Bowler {
    // the need of interface is the common thing is bowler
    //he can be any type so we need a common method type so the interface helps to create a type 
    //by implementing this as a design then easily use this method like given definitions 
        void type(String s);
}
class rightarm implements Bowler{
   public void type(String str){
    System.out.println("Right arm "+str+" Bowler");
   }
}
class leftarm implements Bowler{
    public void type(String str){
    System.out.println("left arm "+str+" Bowler");
    }
}
class bowlerinfo{ // tihs is a class method for utilizing the interface
    public void info(Bowler b,String s){ //by change the bowler input type we can easily change it
        b.type(s);
    }

}

public class Interface2 {
    //now we create the obj using interface as a refernce type
    public static void main(String[] args) {
        Bowler R=new rightarm();    //obj for rigtharm class with interface as reference type
        Bowler L=new leftarm();     // obj for leftarm class with interface as reference type
        bowlerinfo B=new bowlerinfo();  //info
        String str="Fast medium";
        B.info(L,str);//info as a method which changes the bowler type with the obj
        str="spin";
        B.info(R,str);
        //this is the main concept of interface and why we need interface
    }
    
}
