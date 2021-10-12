package Stake;

public class AnimalSelter {
    private AnimalNode front;
    private AnimalNode rear;

    // Constructor
    public AnimalSelter() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Object value) {
        AnimalNode newNode = new AnimalNode(value);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Object dequeue(String animalType) {
        if ( animalType .isEmpty()) {
            return "Queue is empty";
        } else {
            animalType = (String) front.getData();
            front = front.getNext();
            return animalType;
        }
    }

    public Object peek() {

            return front.getData();

    }
}
