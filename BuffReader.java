import java.io.BufferedReader;  // these needs to be imported
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader {
    public static void main(String[] args) throws IOException {
        // int num=System.in.read(); it can be used to read but it reads only one character and it returns the ascii value of the char so only we use the classes
        // it is the basic way we use it get the input like Sysout. and it also needs the IO exception

        // it is the one type getting input from the console
        // for using the buffered reader we need a obj of inputstreamreader;

        System.out.println("Enter the number");

        InputStreamReader in=new InputStreamReader(System.in); // this inputstreamreader needs a input stream that is System.in
        BufferedReader bf=new BufferedReader(in);

        int  num=Integer.parseInt(bf.readLine()); // bf only returns string so we need to parse to int so ww using Integer.parseInt which coverts each letter to int 

     //using bufferedreader leads to checked exception which is IO exception so we need to handle it using try catch or using throws to main which is not a good way.

        System.out.println(num);
       /// bf.close(); // we need to close it like scanner and it needs a try catch due to IO exceptiom
       /// bf can be used in any type of input for files, resources,etc it is reads the entire files also 
    }
}

/*
 Scanner sc = new Scanner(system.in)
 int num=sc.nextint;
 */
// so instead of these many challenges in Buffered reader we need to get input from user the java given the Scanner class to get input from console easily.