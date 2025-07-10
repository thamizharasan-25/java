public class Exception1 {
    public static void main(String[] args) {
        int i=0;
        int j=18;
        // System.out.println("half flow");
        // j=j/i;
        //output if we above instead of try catch
        /*half flow
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception1.main(Exception1.java:14)*/  //  ----> it stops the flow where full flow not printed

        try {//use critical statements which can cause error in this try block
            j=j/i;
        } catch (Exception e) {
            // this catch block only execute when if try has any errors or exception
            System.out.println(" something wrong. "+e);//e is the exception or error occured in runtime it says what exception happened
        }
        System.out.println(j);
        System.out.println("full flow finished");
    }
}
