
package code05;

import java.util.LinkedList;

public class Linkedlist {

    Node head;

    public void insert(int data) {
        if (head == null) {
            Node node = new Node(data);
            head = node;
        } else {
            Node current;
            current = head;
            while (current.next != null) {
                current = current.next;
            }

            Node node = new Node(data);
            current.next = node;

        }

    }

    public String toadd() {
        String printList = "";
        Node current = head;
        int s = 0;
        while (current != null) {
            printList = "{" + current.value + "}" + printList;


            if (current.next == null) {
                printList = printList + "NULL";
                return printList;
            }
            current = current.next;
        }
        return printList;
    }

    public String kthFromEnd(int idx) {
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
            for (int i = counter; i >= counter - idx; i--) {
                if (i == counter - idx) {
                    return "{" + current.value + "}";
                }
                current = current.next;
            }
        }
        return "Exception";


    }

    public void append(int num) {
        Node newNode = new Node(num);
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


    public String toString() {
        String printList = "";
        Node current = head;
        int s = 0;
        while (current != null) {
            printList = printList + "{" + current.value + "}";


            if (current.next == null) {
                printList = printList + "NULL";
                return printList;
            }
            current = current.next;
        }
        toadd();
        System.out.println(printList);
        return printList;

    }



    public void insertBefore(int valueNode, int newNodeValue) {
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


    public void insertAfter(int valueNode, int newNodeValue) {
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

//    public Node zipLists(Linkedlist list1, Linkedlist list2) {
//
//        if (list1.head == null) {
//            return list2.head;
//        } else if (list2.head == null) {
//            return list1.head;
//        } else {
//            Node current1 = list1.head;
//            Node current2 = list2.head;
//            Node list1Next, list2Next;
//
//            while (current1 != null && current2 != null) {
//
//                list1Next = current1.next;
//                list2Next = current2.next;
//
//                current2.next = list1Next;
//                current1.next = current2;
//
//                current1 = list1Next;
//                current2 = list2Next;
//            }
//            return list1.head;
//        }
//    }

    public Linkedlist reverseList(Linkedlist  list) {
        if (list.head == null || list.head.next == null) return list;
        Node current = list.head;
        Node newCurrent  = current.next;
        Node prev = list.head;

        while (newCurrent != null) {
            current.next = newCurrent.next;
            newCurrent.next = prev;
            prev = newCurrent;
            newCurrent = current.next;
        }



//        Node prev = null;
//        while (head != null) {
//            Node next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        }
//        return prev;
//    }

        list.head = prev;
        return list;
    }

}






package code05;

import java.util.LinkedList;

public class Linkedlist {

    Node head;

    public void insert(int data) {
        if (head == null) {
            Node node = new Node(data);
            head = node;
        } else {
            Node current;
            current = head;
            while (current.next != null) {
                current = current.next;
            }

            Node node = new Node(data);
            current.next = node;

        }

    }

    public String toadd() {
        String printList = "";
        Node current = head;
        int s = 0;
        while (current != null) {
            printList = "{" + current.value + "}" + printList;


            if (current.next == null) {
                printList = printList + "NULL";
                return printList;
            }
            current = current.next;
        }
        return printList;
    }

    public String kthFromEnd(int idx) {
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
            for (int i = counter; i >= counter - idx; i--) {
                if (i == counter - idx) {
                    return "{" + current.value + "}";
                }
                current = current.next;
            }
        }
        return "Exception";


    }

    public void append(int num) {
        Node newNode = new Node(num);
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


    public String toString() {
        String printList = "";
        Node current = head;
        int s = 0;
        while (current != null) {
            printList = printList + "{" + current.value + "}";


            if (current.next == null) {
                printList = printList + "NULL";
                return printList;
            }
            current = current.next;
        }
        toadd();
        System.out.println(printList);
        return printList;

    }



    public void insertBefore(int valueNode, int newNodeValue) {
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


    public void insertAfter(int valueNode, int newNodeValue) {
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
            Node current1 = list1.head;
            Node current2 = list2.head;
            Node list1Next, list2Next;

            while (current1 != null && current2 != null) {

                list1Next = current1.next;
                list2Next = current2.next;

                current2.next = list1Next;
                current1.next = current2;

                current1 = list1Next;
                current2 = list2Next;
            }
            return list1.head;
        }
    }

    public Linkedlist reverseList(Linkedlist  list) {
        if (list.head == null || list.head.next == null) return list;
        Node current = list.head;
        Node newCurrent  = current.next;
        Node prev = list.head;

        while (newCurrent != null) {
            current.next = newCurrent.next;
            newCurrent.next = prev;
            prev = newCurrent;
            newCurrent = current.next;
        }



//        Node prev = null;
//        while (head != null) {
//            Node next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        }
//        return prev;
//    }

        list.head = prev;
        return list;
    }

}



}
