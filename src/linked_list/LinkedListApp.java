package linked_list;


import org.w3c.dom.NodeList;

class LinkedNode{

    private int data;
    private LinkedNode next;

    LinkedNode(){
        this.data = 0;
        this.next = null;
    }
    LinkedNode(int data){
        this.data = data;
        this.next = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public LinkedNode getNext() {
        return next;
    }
}

class LinkedList{
    // length
    private int length = 0;
    private LinkedNode head;
    LinkedList(){
        this.length = 0;
    }
    public synchronized LinkedNode getHead(){
        return this.head;
    }
    public synchronized void setHead(LinkedNode linkedNode){
        this.head = linkedNode;
    }
    private synchronized boolean isHeadNull(){
        return  this.head == null;
    }
    public synchronized int getPosition(int data){
        LinkedNode head = getHead();

        if(head == null) return  -1;

        int count = 0;
        while (head != null ){
            if(head.getData() == data){
                ++count;
                break;
            }else{
                ++count;
                head = head.getNext();
            }

        }
        return  count;
 }
    public synchronized int getLength(){
        return this.length;
    }
    public synchronized void insert(int data, int position) {
        if (position < 0 || position > getLength()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        LinkedNode newNode = new LinkedNode(data);

        // Special case: inserting at the head (position 0)
        if (position == 0) {
            newNode.setNext(getHead());
            setHead(newNode); // Assuming setHead() updates the head of the list
            return;
        }

        LinkedNode head = getHead();
        int count = 0;

        // Traverse the list to find the node just before the insert position
        while (count != position - 1) {
            head = head.getNext();
            count++;
        }

        // Insert the new node
        LinkedNode temp = head.getNext(); // Node after the insertion point
        head.setNext(newNode);
        newNode.setNext(temp);
    }
    public synchronized void remove(int position) {
        if (position < 0 || position >= getLength()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // Special case: removing the head node (position 0)
        if (position == 0) {
            setHead(getHead().getNext()); // Move the head to the next node
            return;
        }

        LinkedNode head = getHead();
        int count = 0;

        // Traverse the list to find the node just before the position
        while (count != position - 1) {
            head = head.getNext();
            count++;
        }

        // Now, head is the node just before the one to be removed
        LinkedNode nodeToRemove = head.getNext(); // This is the node we want to remove
        head.setNext(nodeToRemove.getNext()); // Remove the node by skipping it
    }
    public synchronized void insertAtBegin(int data){
        LinkedNode newNode = new LinkedNode(data);
        LinkedNode head = getHead();
        newNode.setNext(head);
        setHead(newNode);
        ++this.length;
    }
    public synchronized void insertAtEnd(int data){
        LinkedNode head = getHead();
        if(head == null){
            LinkedNode newNode = new LinkedNode(data);
            this.setHead(newNode);
            ++this.length;

        }else{
            while (head.getNext() != null){
                head = head.getNext();
            }
            LinkedNode newNode = new LinkedNode(data);
            head.setNext(newNode);
            ++this.length;
        }


    }
    public synchronized void removeAtBegin(){
        if(!isHeadNull()){
            setHead(getHead().getNext());
            --this.length;
        }
    }
    public synchronized void removeAtEnd(){
        LinkedNode head = getHead();
        if(head != null){
            while (head.getNext().getNext() != null){
               head = head.getNext();
            }
            head.setNext(null);
           --this.length;
        }

    }
    public synchronized void clearList(){
        this.length = 0;
        this.head = null;
    }
    public void print(){
        LinkedNode head = getHead();
        if(head != null) {
          while (head != null){
              System.out.print(head.getData()+", ");
              head = head.getNext();
          }
        }
    }


}


public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList linkedList = getLinkedList();


        linkedList.print();
        System.out.println("\nLength of list: "+linkedList.getLength());
        linkedList.removeAtEnd();

        linkedList.print();
        System.out.println("\nLength of list: "+linkedList.getLength());
        linkedList.removeAtEnd();

        linkedList.print();
        System.out.println("\nLength of list: "+linkedList.getLength());
        linkedList.removeAtEnd();

        linkedList.print();
        System.out.println("\nLength of list: "+linkedList.getLength());
        linkedList.removeAtEnd();

//        System.out.println("\nBefore clearList");
//        linkedList.print();

//
//        linkedList.clearList();
//        System.out.println("\nAfter clearList");
//        linkedList.print();
//        System.out.println("\nLength of list: "+linkedList.getLength());

        System.out.println("List");
        linkedList.print();
         System.out.println("\nPosition: "+linkedList.getPosition(70));

        System.out.println("\nAfter remove at begin\n");
        linkedList.removeAtBegin();
        linkedList.print();

        System.out.println("\nAfter remove at begin\n");
        linkedList.removeAtBegin();
        linkedList.print();

        System.out.println("\nAfter remove at begin\n");
        linkedList.removeAtBegin();
        linkedList.print();
        System.out.println("\nAfter insert at begin\n");
        linkedList.insertAtBegin(99);
        linkedList.insertAtBegin(299);
        linkedList.insertAtBegin(399);
        linkedList.print();
        System.out.println("\nLength of list: "+linkedList.getLength());

        System.out.println("after inserting at position");
        linkedList.insert(25,5);
        linkedList.print();
        System.out.println("remove at position");
        linkedList.remove(2);
        linkedList.print();
    }

    private static LinkedList getLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(60);
        linkedList.insertAtEnd(70);
        linkedList.insertAtEnd(80);
        linkedList.insertAtEnd(90);
        linkedList.insertAtEnd(100);
        linkedList.insertAtEnd(110);
        linkedList.insertAtEnd(120);
        linkedList.insertAtEnd(130);
        return linkedList;
    }
}
