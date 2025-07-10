import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int arr[]=new int[3];
     int unit[]=new int[3];
     int hundreds[]=new int[3];
      int tens[]=new int[3];
      int thousand[]=new int[3];
        System.out.print("Enter the number:");
     for (int i = 0; i < 3; i++) {
        arr[i]=sc.nextInt();
        unit[i]=arr[i]%10;
        arr[i] /= 10;
        tens[i]=arr[i]%10;
        arr[i]/=10;
        hundreds[i]=arr[i]%10;
        arr[i]/=10;
        thousand[i]=arr[i]%10;
     }
    int key=thousand[0];
     int key2=hundreds[0];
     int key3=tens[0];
     int key4=unit[0];
     int fkey=1;
     for (int i = 1; i < 3; i++) {
            if(thousand[i]<key)key=thousand[i];
            if (hundreds[i]>key2)key2=hundreds[i];
            if (key3>tens[i])key3=tens[i];
            if(unit[i]>key4)key4=unit[i];
            }  
    fkey=(key*1000)+(key2*100)+(key3*10)+key4;
    System.out.println(fkey);
    sc.close();     
     }

    }

