import java.util.Scanner;

public class RevStrWords {
    public static String revstr(String sentce){
         String words[]=sentce.split("\\.");
         
        StringBuilder str=new StringBuilder();
        for (int i = words.length-1; i >=0; i--) {
            str.append(words[i]);
            if(i!=0){
                str.append(".");
            }
        }
        return str.toString();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String sentce=sc.nextLine();
        sc.close();
       
        System.out.println("otuput string:\n"+revstr(sentce));
    }
}
 