public class Enum{
    enum status{
        start(1),running(2),success(3);
        private int value;
        status(int value){
            this.value=value;
        }
        public int getstatus(){
            return value;
        }//we can use this like also in string also by giving the description for the days,jobs,etcc
        //start,running,pending,success,finished//enums are the named constants
    }
    public static void main(String[] args) {
        status s[]=status.values();
        
        status ss=status.running;
        System.out.println("IN STATUS: "+ss+" status : "+ss.getstatus());
        // System.out.println("THE INDEX OF THE STATUS RUNNING:"+ss.ordinal());
        for (status st : s) {
            System.out.println(st+" : "+st.ordinal());
        }

    }
}
