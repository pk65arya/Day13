package Day13assignment;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedlistExample list=new LinkedlistExample();
        Node head=list.add(56,null);
        list.add(30,head);
        list.add(70,head);
        list.printValue(head);
       // System.out.println(      list.search(head,30));
    //    head=list.pop(head);
     //   list.pop(head);
       // head=list.poplast(head);
     //   list.printValue(head);
        System.out.println();
       list.insert(head,30,40);
        list.printValue(head);

list.delete(head,40);
      //  list.sort(head);
        list.printValue(head);
        System.out.println(list.size(head));
        list.sort(head);
        list.printValue(head);
/*
LinkedList<Integer> list1=new LinkedList<Integer>();

        System.out.println(list1);
*/

    }

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class LinkedlistExample {
       // Node head;
        public static Node add(int data, Node head){
            Node newNode= new Node(data);
            if (head==null){
                head=newNode;
                return head;
            }else {
                Node temp=head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
                return head;
            }

        }
        public void printValue(Node head){
            if (head==null){
                System.out.println("Given list is empty");
            }else {
                Node temp=head;
                while (temp!=null){
                    System.out.print(temp.data +" -> ");
                    temp=temp.next;
                }
            }
        }

public Node pop(Node head){
            if (head==null){
                return null;
            }
            Node tempnode=head;
            head=head.next;
            return head;
}
public Node poplast(Node head){
            //to check if linked list is empty
            if (head==null){
                return null;
            }
            //to check if linked list has only one element in that case head will be the last element and first element.
    //return null
            if (head.next==null){
                return null;
    }
            //find second last element
    Node secondlastelement=head;
            while (secondlastelement.next.next!=null)
                secondlastelement=secondlastelement.next;
                secondlastelement.next=null;
                return head;

}
boolean search(Node head,int x){
            Node current=head;
            while (current!=null){
                if (current.data==x) {
                    return true;
                }

                current=current.next;
            }
           return false;
}
public void insert(Node head,int x,int y){
            if (head==null){
                return ;
            }
            Node current=head;
            Node newcurrent=new Node(y);
            while (current!=null){
                 if (current.data==x){
                     //Temporary variable me keep next node
                     Node temp=current.next;

                     //current node will sgtart pointing to new node
                     current.next=newcurrent;
                     //new node will point to next node of current node i.e temp
                     newcurrent.next=temp;
                 }
                 current=current.next;
            }
}
public void delete(Node head,int x){
            Node current=head;
            while (current.next!=null){
            if(current.next.data==x){
                //40 ka adress = 70 ke adress
                current.next=current.next.next;
            }
            current=current.next;
}}
        public int size(Node head){
            Node curr=head;
            int count=0;
            if(head==null){
                return count;
            }

            while (curr!=null){
                count++;
                curr=curr.next;
            }
            return count;
        }
        public void sort(Node head){
            Node curr = head;
            Node index=curr.next;
            while (curr!=null){
                while (index!=null){
                    if(curr.data>index.data){
                        int temp=curr.data;
                        curr.data= index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                curr=curr.next;
            }
        }

    }
}
