package Stake;

public class Stack <T>{

    private Node top;
    private Node head;

    public Stack() {
    }

    public void push(char data) {
        if (isEmpty()) {
            Node node = new Node(data);
            top = node;
        } else {
            Node node = new Node(data);
            node.setNext(top);
            top = node;
        }
    }

    public String pop() {
        if (isEmpty()) {
            return "The stack is empty";
        } else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return "The stack is empty";
        } else {
            return top.getData();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }
}
