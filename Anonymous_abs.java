abstract class college{
   public abstract void stuname();
   public abstract void year();
//in abstract cls abstract methods only declared .no defenition given here so we can use by extends by another cls
//For abstract class no obj will be created so to use the abstract  class we need to inherit with public class
}
public class Anonymous_abs {
    //instead of creating another class for using the the abstract cls where we need use this abstract cls for only one time.
    //we can use anonymous inner class for the abstract class itself..
    public static void main(String[] args) {
        college obj=new college(){
           public void stuname(){ //we need to change the access modifier for the method to use it 
                System.out.println("name:Tamil");
            }
            public void year(){
                System.out.println("Final year");
            }
        };
        obj.stuname();
        obj.year();
        //actally we cant create object for the abstract cls so here we created object for the anonymous cls not for collge class..
        //if there is two abstract methods in the class then we need to give definition for both methods mandatorily..
    } 
}
