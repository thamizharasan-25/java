package C2Ctasks;
    class even{
        public void printeven(int a,int b){
        for(int i=a;i<=b;i++ ){
            if(i%2==0)
             System.out.println(i);
        }
    }
}
public class For2 {
    public static void main(String[] args) {
        even obj1=new even();
        obj1.printeven(23, 57);
    }
}
