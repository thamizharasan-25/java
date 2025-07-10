package C2Ctasks;
//Encapsulation / Abstraction
class Books {
    private String name;
    private author Author;
    private double price;
    private int qtyInstock;
    Books(String name,author Author,double price,int qtyInstock ){
        if(price>0 && qtyInstock>0)
        {
        this.Author=Author;
        this.name=name;
        this.price=price;
        this.qtyInstock=qtyInstock;
    }
}//setters
    public void setbookname(String name){
            this.name=name;
    }
    public void setprice(double price){
            this.price=price;
    }public void setstock(int qtyInstock){
        this.qtyInstock=qtyInstock;            
    }public void setauthor(author Author){
            this.Author=Author;
    }
    //gettters
    public String getName() {
        return name;
    }
    
    public author getAuthor() {
        return Author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInstock;
    }
    public void print_bookdetails(){
        System.out.println("Book name: "+name);
        System.out.println("Price:"+price);
        System.out.println("Stock:"+qtyInstock);
        System.out.println("Author details: "+Author.display());
    }

}
public class Oops4 {
    public static void main(String[] args) {
        
    author A1=new author("John Marston", "johnmarston@gmail.com", 'M');
    Books book1=new Books("FIFTY SHADES OF GREY",A1,2000,150);
        book1.print_bookdetails();
    }
}
