
import java.util.Scanner;
public class Task23 {
//Count the Misses  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        sc.close();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='0'&& str.charAt(i)<='9' || str.charAt(i)==' ')) {
             continue;   
            }else {
                //System.out.print(" "+str.charAt(i));
                //missed count will store here
                count+=1;
        }}
    System.out.println(count);
    
    }
}


