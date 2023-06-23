package Day13assignment;

public class Queue {

    public static void main(String[] args) {
        Queue q =new Queue();
        q.enque(10);
        q.enque(30);
        q.enque(40);
        q.dQueue();
        q.dQueue();
        q.enque(50);
        q.enque(60);
        while (!q.isempty()){
            System.out.println(q.peek());
            q.dQueue();
        }
      //  System.out.println();
    }

    Node rear,front;

    public Queue() {
        this.rear = null;
        this.front = null;
    }

    void enque(int data){
        Node temp=new Node(data);

        //this means queue is empty
        if(isempty()){
            front=rear=temp;

        }else {
            rear.next = temp;
            rear = temp;
        }
    }
     int dQueue(){
      if(isempty()){
          return -1;
      }
      int dt=front.data;
      if(front==rear){
          rear=null;
      }
      front=front.next;
      return dt;
    }
    boolean isempty(){
        return front==null && rear==null;
    }

      int peek(){
        if(isempty()){
            System.out.println("Empty");
            return -1;
        }
        return front.data;
    }

}


     class Node{
        int data;
        Node next;

         public Node(int data) {
             this.data = data;
             this.next = null;
         }
     }


