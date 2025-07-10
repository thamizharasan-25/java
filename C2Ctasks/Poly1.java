package C2Ctasks;
class Fruit{
    private String name;
    private  String taste;
    private int size;
    Fruit(String name,String taste,int size){
        this.taste=taste;
        this.name=name;
        this.size=size;
    }
    void eat(){
        System.out.println("name: "+getname() +" Taste: "+gettaste());
    }
    void size(){
        System.out.println("Size:"+getsize());
    }

    String getname(){
        return name;
    }
    String gettaste(){
        return taste;
    }
    int getsize(){
        return size;
    }
}
class Apple extends Fruit{
    Apple(){
        super("Apple","Sweet",15);
    }
    @Override
    void eat(){
        System.out.println("name: "+getname() +" Taste: "+gettaste());
    }
}
class Mango extends Fruit{
    Mango(){
        super("Mango","Sour ",20);
    }
    @Override
    void eat(){
        System.out.println("name: "+getname() +" Taste: "+gettaste());
    }

    void size(){
        System.out.println("Size:"+getsize());
    }
}
public class Poly1 {
    public static void main(String[] args) {
        Fruit apple=new Apple();
        Fruit mango=new Mango();
        //Mango mango2=new Mango();
        apple.eat();
        mango.eat();
        mango.size();
        //mango2.size();
    }
}
