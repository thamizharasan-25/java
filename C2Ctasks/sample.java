package C2Ctasks;
class Parent {

    public static void display() {

        System.out.println("Parent");

    }

}

class Child extends Parent {

    public static void display() {

        System.out.println("Child");

    }
}

public class sample {
    public static void main(String[] args) {

        Parent obj = new Child();

        obj.display();

}
}