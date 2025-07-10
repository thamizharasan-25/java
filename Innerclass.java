
class outercls{
    public void show(){
        System.out.println("in show");
    }

    class innercls{         // ststic class innercls  if it used like this we no need obj1 we can use like outercls.innercls();
        public void display(){
            System.out.println("In display");
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {
        outercls obj=new outercls();
        //innercls obj1=new innercls()       // we cant access the innercls in this format;
       // outercls.innercls obj1=new outercls.innercls();//by this method also we cant access //we can access this only if the innercls in static
        outercls.innercls obj1=obj.new innercls();  //by this way only we can access the innercls
        obj.show();
        obj1.display();
    }
}
