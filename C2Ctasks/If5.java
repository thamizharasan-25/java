package C2Ctasks;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        String gender;
        int age;
        System.out.println("enter the gender:");
        Scanner sc=new Scanner(System.in);
        gender=sc.next();
        gender=gender.toLowerCase();
        
        if(gender.equals("female") || gender.equals("male")){
        System.out.println("enter the Age:");
        age=sc.nextInt();
        sc.close();

        if(gender.equals("female")){
            if(age>=1 && age<=58)System.out.println("the percentage of interest is 8.2%.");
            else if(age>58 && age<=100) System.out.println("the percentage of interest is 9.2%.");
            else System.out.println("Invalid Age");
        }else{
            if(gender.equals("male")){
            if(age>=1 && age<=58)System.out.println("the percentage of interest is 8.4%.");
            else if(age>58 && age<=100) System.out.println("the percentage of interest is 10.5%.");
            else System.out.println("Invalid Age");
        }
        }
    }else System.out.println("provide the correct gender!");
        
    }
}
