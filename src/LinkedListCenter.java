import java.util.Collections;

public class LinkedListCenter {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        LinkedList.Node head = linkedList.getHead();

        linkedList.add(new LinkedList.Node(1));
        linkedList.add(new LinkedList.Node(2));
        linkedList.add(new LinkedList.Node(3));
        linkedList.add(new LinkedList.Node(4));

        LinkedList.Node current = head;
        LinkedList.Node middle = head;
        int length =0;

        while (current.getNext()!= null){
            length++;
            if(length%2==0){
                middle =middle.getNext();
            }
            current = current.getNext();
        }

        if(length % 2 ==1){
            middle = middle.getNext();
        }

        System.out.printf("The length of the linked list is %d",length);
        System.out.println();
        System.out.println("The  middle element is "+middle.getData());

        System.out.printf("The list is circular ? : %b",findIfCircular(linkedList));

    }

    private static boolean findIfCircular(LinkedList l){

        LinkedList.Node fast = l.getHead();
        LinkedList.Node slow = l.getHead();

        while (fast!=null && fast.getNext()!=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        return fast==slow;
    }

//    private static LinkedList reverse(LinkedList l){
//        LinkedList.Node pointer = l.getHead();
//        LinkedList.Node previous =null,current =null;
//
//        while(pointer.getNext()!=null){
//            current =pointer;
//            pointer =pointer.getNext();
//
//            //reversal
//            current.getNext() = previous;
//            previous = current;
//            l.getHead() = current;
//
//        }
//    }


}

class LinkedList{

    private Node head;
    private Node tail;

    public LinkedList(){
        this.head = new Node(0);
        this.tail = this.head;
    }

    public Node getHead(){
        return this.head;
    }

    public void add(Node n){
        this.tail.next = n;
        tail = n;
    }



    public static class Node{
        private Node next;
        private int data;

        public Node(int data){
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

    }
}
