public class Exception2 {
    //try with multiple catch
    public static void main(String[] args) {
        int i=0;
        int j=20;
        String str=null;
        int arr[]=new int[5];
        System.out.println("half flow ");
        try {
            System.out.println(str.length()); // if a statement gets error then the try block will stop and the flow will move to catch so other lines in try doesnt work
            j=j/i;
            System.out.println(arr[5]);
        } catch (ArithmeticException e) { //here ArithmeticException is a class which is subclass for the Exception 
            System.out.println("dont divide using 0");//we can give custom messages or print the exception itself by " e object"
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("limit exceeded");
        }
        catch(Exception e){ //it should be used last if we mentioned any other exceptions if it kept first it handles the all exceptions and other catch gives errors
            System.out.println(e); //it accepts the all type of exception (it acts as the parent for all exception)
        }
        System.out.println("j = "+j);
        System.out.println("full flow");
        // the full flow means the code excuted without a break the flow 
    }
}
