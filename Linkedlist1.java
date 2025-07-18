class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
    
}
public class Linkedlist1{
    Node head=null;
   public void add(int data){
        Node newnode=new Node(data);
        Node current=head;
        if(head==null)
            head=newnode;
        else{
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void Printallvalues(){
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+"   ");
            current=current.next;
        }
        System.out.println();
    }
        //main method in link.java
    
}
