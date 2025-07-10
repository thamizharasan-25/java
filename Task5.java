import java.util.Scanner;
public class Task5 {
    //Secret Message agency 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        sc.close();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='0'&& str.charAt(i)<='9')) {
             continue;   
            }else {
                //System.out.print(" "+str.charAt(i));
                count+=1;
        }}
    System.out.println(count);
    
    }
}
