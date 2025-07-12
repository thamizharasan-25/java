import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithRes {
    public static void main(String[] args) throws IOException {
        //here we can use try and finally for closing the resources
        //try with resources means resouces like buffered reader which needs to be closed explicitly whenever u create objects
        //while using try catch we cant close so we finally we can use try ,catch, finally or  try, finally
        //int i=0;
        int j=0;
        //BufferedReader bf=null;
        System.out.println("enter a number:");
      /*   try {
            bf=new BufferedReader(new InputStreamReader(System.in));
            j=Integer.parseInt(bf.readLine());
            System.out.println(j);
        } catch (Exception e) {
           System.out.println(e);
        }
        finally{ // it is the block which executes with or wihout exception
            bf.close(); // it also needs try catch or throws IOexception in main method which handled by JVM (it is not good way to do this)
        } this works fine but to simply this we try with resoures try() catch*/

        try ( BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));) { // it is try with resources where objects are created in try()
            j=Integer.parseInt(bf.readLine());                                          // and it auto closes after the try block executed
            System.out.println(j);
        } catch (Exception e) {
            System.out.println(e);
    }
}
}
///more efficient is to use scanner class with the try and finally which is a good option to close 
/// but try with resources() will be simple shortcut for single or two objects 