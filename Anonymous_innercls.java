class outer{
/// THE INNERCLASS ARE CREATED FOR ONE TIME PURPOSE ONLY...
    public void show(){
        System.out.println(" In Outercls");
    }
}
public class Anonymous_innercls {
    public static void main(String[] args) {
        //now we want to create a anonymous inner cls where there should be no name for it and it should be used only once so,
        //we no need to create new cls so here's how we use the innercls using the outer obj
        outer obj=new outer(){
            public void show(){
                System.out.println("In Anonymous Innercls");
            }
        };//this is the implementation of anonymous innercls saying that create an innercls
        obj.show();
    }



}
