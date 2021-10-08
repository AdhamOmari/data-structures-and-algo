package code05;

import java.util.LinkedList;

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
public String toadd(){
    String printList = "";
    Node current = head;
    int s=0;
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

public String keq(int idx){
    Node current = head;
    int counter = 0;
    while (current.next != null) {
        current = current.next;
        counter++;
    }

    if (idx > counter || idx < 0) {
        return "Exception";
    } else {
        current = head;
        for (int i = counter ; i >= counter-idx; i--) {
            if (i == counter-idx) {
                return "{"+current.value+"}";
            }
            current = current.next;
        }
    }
    return "Exception";


}

public void append(int newData2){

    Node newNode = new Node(newData2);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

    public  String toString(){
        String printList = "";
        Node current = head;
        int s=0;
        while (current!= null) {
            printList = "{"+current.value +"}"  +printList;


            if (current.next == null) {
                printList = printList + "NULL";
                return printList;
            }
            current = current.next;
        }
        toadd();
        return printList;

    }


    public void insertAfter(int valueNode, int newNodeValue) {
        Node newNode = new Node(newNodeValue);
        if (head.value == valueNode) {
            insert(newNodeValue);
        } else if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.value == valueNode) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
    }
    public void insertBefore(int valueNode, int newNodeValue) {
        Node newInsertNode = new Node(newNodeValue);
        if (head == null) {
            head = newInsertNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.value == valueNode) {
                    newInsertNode.next = current.next;
                    current.next = newInsertNode;
                }
                current = current.next;
            }
        }

    }

    public Node zipLists(Linkedlist list1, Linkedlist list2) {

        if (list1.head == null) {
            return list2.head;
        } else if (list2.head == null) {
            return list1.head;
        } else {
            Node current1=list1.head;
            Node current2=list2.head;
            Node list1Next,list2Next;

            while (current1 != null && current2 != null) {

                list1Next=current1.next;
                list2Next=current2.next;

                current2.next=list1Next;
                current1.next=current2;

                current1=list1Next;
                current2=list2Next;
            }
            return list1.head;
        }
    }

}
