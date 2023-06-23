package Day13assignment;


public class OrderedLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();
        Node newNode;
        newNode=list.newNode(4);
        list.insertData(newNode);
        newNode= list.newNode(3);
        list.insertData(newNode);
        list.printList();
    }

    void insertData(Node newNode){
        Node curr ;
       if(head==null || head.data>=newNode.data){
           newNode.next=head;
           head=newNode;
       }else {
           curr=head;
           while (curr.next!=null && curr.next.data<newNode.data){
               curr=curr.next;
           }
           newNode.next=curr.next;
           curr.next=newNode;
       }
    }
    Node newNode(int x){
        Node y = new Node(x);
        return y;
    }

    void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
    }
}
