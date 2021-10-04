package code05;

public class Linkedlist {

    Node head;
    public void insert(int number) {
        Node newNode = new Node(number);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public boolean includes(int value) {

        Node curr = head;
        while(curr != null){
            if (curr.value == value){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }

    public  String toString(){
        String printList = "";
        Node current = head;
        while (current!= null) {
            printList = "{"+current.value +"}"  +printList;


            if (current.next == null) {
                printList = printList + "NULL";
                return printList;
            }
            current = current.next;
        }
        return printList;
    }
}
