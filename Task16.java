import java.util.Scanner;

public class Task16 {
    
    float area(int a,int b ){
            return((a*b)/2);
    }
        //Gift hampers to winners  
    public static void main(String[] args) {
                Task16 aot=new Task16();
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the bill");
                int b[]=new int[2];
                int h[]=new int[2];
                float area[]=new float[2];
                for (int i = 0; i < 2; i++) {
                    b[i]=sc.nextInt();
                    h[i]=sc.nextInt();
                    area[i]=aot.area(b[i], h[i]);
                }

                for (int j = 0; j < 1; j++) {
                    if(area[j]>area[j+1])
                            System.out.printf("%.2f",area[j]);
                    else
                        System.out.printf("%.2f",area[j+1]);
                }
                
                sc.close();

    }
    
}
