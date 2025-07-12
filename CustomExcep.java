class TamilException extends Exception{ // we can extends either exception or Runtime exception
    TamilException(String s){
        super(s);//if we not used this super we cant print the string inside the constructor of the exception
        //if not given the string inside it will be handled by the exception class
    }
}
public class CustomExcep {
    //we can create our own exception if we need.
    public static void main(String[] args) {
   
        int i=25;
        int j=20;
        System.err.println("first");
        try {
            j=j/i;
            if(j==0){ //here i am throwing my own exception
                throw new TamilException("j should not be zero");
            }
        } catch (TamilException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("FUll Flow executed");
    }
}
// so by this we can easily create the customixed excepections.

