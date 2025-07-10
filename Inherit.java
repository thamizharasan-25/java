
class parent  {
    int mark;
    void sparent(int mark){
        this.mark=mark;
    }
    void get(){
        System.out.println(mark);
    } 
}
     class Child extends parent {
        String name;
        void schild(String name){
            this.name=name;
        }
        void cget(){
            System.out.println(name);
        }
        
    }

    
public class Inherit {
    public static void main(String[] args) {

        Child obj=new Child();
        obj.sparent(50);
        obj.schild("tamil");
        obj.get();
        obj.cget();




        
    }
}
