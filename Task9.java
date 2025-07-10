import java.util.Scanner;
public class Task9 {
    //Employee’s Rating Point  
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int erp;
        System.out.println("Enter the erp:");
        erp=sc.nextInt();
        sc.close();
        if (erp>30 && erp<100) {
            if(erp>80){
                System.out.println("A");
            }else if (erp<80 && erp>60) {
                System.out.println("B");
            }else if (erp<60 && erp>50) 
                System.out.println("C");
            else 
                System.out.println("D");
        }
    }
}
