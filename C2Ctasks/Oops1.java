package C2Ctasks;
class Box{
     private int height;
     private int width;
     private int depth;
    Box(int depth,int width,int height){
        this.height=height;
        this.depth=depth;
        this.width=width;
    }
    public int volume(){
        int volume=height*depth*width;
        return volume;
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Box b=new Box(10,12, 5);
        System.out.println(b.volume());
    }
    
}
