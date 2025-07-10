import java.util.Scanner;

    //Online Game     

public class Task10 {
    int fact(int n){
        if(n==1 || n==0) return(1);
        else
            return(n*fact(n-1));
    }
public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            Task10 f=new Task10();
            System.out.print("Enter the n value:");
            int n= sc.nextInt();
            int fct=f.fact(n);
            int c=0;
            //System.out.println(fct);
            sc.close();
            while (fct>0) {
                if (fct%10 == 0) c+=1;
                fct=fct/10;
            }
            System.out.println(c);
        }

}