package C2Ctasks;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;        
            case 5:
                System.out.println("May");
                break;            
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;   
             case 8:
                System.out.println("August");
                break;      
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;      
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        
            default:
                System.out.println(" Invalid Month ");
                break;
        }
    }
}
/*import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {         //store months in arrays and call using index
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.print("Enter month number (1-12): ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 12)
            System.out.println(months[num - 1]);//num-1 is for getting index value whose starts from 0
        else
            System.out.println("Invalid Month");

        sc.close();
    }
}
 */
