public class LinkedList{
     
   class Node
   {
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }

   }

   public Node head=null;
   public Node tail=null;

   public void add(int data)
   {
    Node n=new Node(data);
    if(head==null)
    {
        head=n;
        tail=n;
    }
    else
    {
        tail.next=n;
        tail=n;
    }
   }

   public void show()
   {
    Node temp=head;

    while(temp!=null)
    {
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
   }

   public static void main(String[] args)
   {
    LinkedList l=new LinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.show();
   }
   
}