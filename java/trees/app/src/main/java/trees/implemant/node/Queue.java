package trees.implemant.node;



public class Queue <T>{
    public Node <T> front;
    public Node <T> rear;

    public void enqueue(T value){
        Node <T> newNode=new Node(value);
        if (front==null){
            front=newNode;
            rear=newNode;
        }
        else {
            rear.next=newNode;
            rear=newNode;
        }

    }
    public T dequeue(){
        if (front==null) try {
            throw new Exception("Empty Queue");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        Node  <T> dequeuedNode=front;
        front=front.next;
        dequeuedNode.next=null;
        return dequeuedNode.value;

    }
    public T peek(){
        if (front==null) try {
            throw new Exception("Empty Queue");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return front.value;

    }
    public boolean isEmpty(){
        if (front==rear) return true;
        return false;
    }


}
