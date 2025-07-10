import java.util.Scanner;

public class Task20 {
    
public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the string");
                String str1=sc.next();
                String str2=sc.next();
                int[] freq1 = new int[256];  
                int[] freq2 = new int[256];
                for (int i = 0; i < str1.length(); i++) {
                    freq1[str1.charAt(i)]+=1;
                }
               // System.out.printf("%s",sum-sum1);

  }  }
