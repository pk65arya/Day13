package Day13assignment;

import dsconcept.Main;

import java.util.LinkedList;

public class Stack {

    public static void main(String[] args) {

        StackusingLinkedList stack=new StackusingLinkedList();
        stack.pushElement(70);
        stack.pushElement(30);
        stack.pushElement(56);
//        System.out.println(stack.size());
//        stack.displayelements();
//        System.out.println();
//        System.out.println(stack.peak());
//        stack.pop();
//        System.out.println();
       stack.displayelements();


       for (int i=0;i<=stack.size();i++){
          if (stack.size()==0){
                System.out.println("Stack is empty");
            }else{
                System.out.println("peak element is: "+stack.peak());
                System.out.println("top element is deleted:");
                 stack.pop();
                stack.displayelements();
            }
        }

    }
}
class StackusingLinkedList{

    private class Node{
        int data;
        Node next;
    }
    Node topelemnt;

    public StackusingLinkedList() {
        this.topelemnt = null;
    }

    public  void pushElement(int x){
        Node temp=new Node();
        if (temp==null){
            return;
        }
        //assign data in node
        temp.data=x;
        //update adress of top element
        temp.next=topelemnt;
        //update top element to temp
        topelemnt=temp;
    }
    public void displayelements(){
        if (topelemnt==null){
            return;
        }
        Node node=topelemnt;
        while (node!=null){
            System.out.print(node.data+ " -> ");
            node=node.next;
        }
    }
    public void pop(){
        if (topelemnt==null){
            return;
        }
        topelemnt=(topelemnt).next;
    }
    public int peak(){
        if (topelemnt==null)
return -1;

        return topelemnt.data;
    }
    public int size(){
        int count=0;
        Node node=topelemnt;
        while (node!=null){
            count++;
            node=node.next;
        }
        return count;
    }
    }



