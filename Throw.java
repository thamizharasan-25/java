public class Throw {
    public static void main(String[] args) {
        int i=25;
        int j=20;
        System.err.println("first");
        try {
            j=j/i;
            if(j==0){//whenever the j gets zero i need to throw an exception.so we use throw wherever we want to throw the esxception
                throw new ArithmeticException("j should not be zero");//this throw throws the exception which is created as a object to the catch it procees it.
            }
            //new ArithmeticException() creates a new object and it passes it and it also has constructor where we can write the msg..
        } catch (ArithmeticException e) {
            System.out.println(e);//if i need i handle the exception like i changed the value this refers whenever this exception occurs the value of j changes
            //j=20;
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("FUll Flow executed");
    }
}
//no stop in flow of the runtme.