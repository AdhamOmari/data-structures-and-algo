package trees.implemant.node;


<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> 8511a8a9411e5635f117b75ca67217fe179d8f70
public class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> leftChild;
    public Node<T> rightChild;
    public List<Node> child = new ArrayList<>();

    public Node(T value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    public Node<T> getNext() {
        return next;
    }

}