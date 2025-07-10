class calc{
    public int add(int n1,int n2){
        return n1+n2;
    }//method overriding is the run time process where we override the same name method in parent class and override to the child class
}
class Advcalc extends calc{
    public int add(int n1,int n2){//we should give the same parameters as the parent cls
        return n1+n2+2;             //in method overloading we use diff parameters or diffent return type but here we should use same .
    }           
}

public class Overriding {
    public static void main(String[] args) {
        Advcalc obj=new Advcalc();
        System.out.println(obj.add(10, 20));
    }
}
