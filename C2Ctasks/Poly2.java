package C2Ctasks;
class Shape{
    void draw(){
        System.out.println("“Drawing Shape");
    }
    void erase(){
        System.out.println("“Erasing Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
     void erase(){
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
     void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing square");
    }
     void erase(){
        System.out.println("Erasing square");
    }
}

public class Poly2 {
    public static void main(String[] args) {
    Shape c=new Circle();  
    Shape t=new Triangle();  
    Shape s=new Square();
    
    c.draw();
    c.erase();
    t.draw();
    t.erase();
    s.draw();
    s.erase();
    

    }
}
