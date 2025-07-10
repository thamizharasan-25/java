interface Bowler {              //we didn't use public due to only one public class should be in the java file
        void shortball();       //the correct syntax for seperate file is___ public interface Bowler{}
        int speed(int n);       // In Interface the methods are abstract by default so we only declare it and implemented in classes
        int age=24;
        String name="Bumrah";   //these variable are by default as static and final so it can accessed witout objects
    
}//Interface provides only design and the class should implement it 
class fastbowler implements Bowler{
        public void shortball(){
                System.out.println("Its a short ball and bouncer!!");
        }
        public int speed(int n){
                System.out.println("the spped of the ball is "+n+"kmph");
                return 1;
        }
}

public class Cricket
{
    public static void main(String[] args) {
        Bowler B;
        //we can use the implement as ref type
        B=new fastbowler();
        //we can use anonymous inner cls also if we need the interface only once..   
        //for creating obj we need classes
        
        //System.out.println("Bowler name:"+B.name);
        //System.out.println("age:"+B.age);
        //we can access withut the object B
        System.out.println("Bowler name:"+Bowler.name);
        System.out.println("age:"+Bowler.age);
        B.shortball();
        B.speed(143);

}
}
