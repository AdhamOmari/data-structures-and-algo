package Stake;

public class AnimalSelter {
    private AnimalNode front;
    private AnimalNode rear;

    // Constructor
    public AnimalSelter() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Object data) {
        AnimalNode newNode = new AnimalNode(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Object dequeue(String Type) {
        if ( Type .isEmpty()) {
            return "Queue is empty";
        } else {
            Type = (String) front.getData();
            front = front.getNext();
            return Type;
        }
    }

    public Object peek() {

            return front.getData();

    }
}
