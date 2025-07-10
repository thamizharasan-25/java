package C2Ctasks;

public class For3 {
    public static void prime(int a,int b){
        for (int i = a; i < b; i++) {
            int count=0;
            for (int j = 2; j < i/2; j++) {
                if(i%j==0){
                    count++; 
                    break;
            }
        }
            if(count==0)
                System.out.print(i+"   ");
        
    }
}
    public static void main(String[] args) {
        prime(10,99);
    }
}
