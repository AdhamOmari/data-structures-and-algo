package trees.implemant;

import trees.implemant.node.Node;
import trees.implemant.node.Queue;

import java.util.ArrayList;

public class BinaryTree<T extends  Comparable<T>>extends BinarySearchTree {


    public void preorderTraversal() {
        if (isEmpty()) {
            return ;
        }
        preOrder(getRoot());
    }
    public void preOrder( Node<T> node) {
        if (node == null) {
            return;
        }

        System.out.printf( node.getValue() +" -> ");
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());
    }
    public void postorderTraversal() {
        if (isEmpty()) {
            return;
        }

        postOrder(getRoot());
    }
    public void postOrder( Node<T> node) {
        if (node == null) {
            return;
        }
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());
        System.out.printf( node.getValue() +" -> ");
    }

    public void inorderTraversal() {
        if (isEmpty()) {
            return ;
        }
        traverseInorder(getRoot());
    }

    private void traverseInorder(Node<T> root) {
        if (root.getLeftChild() != null) {
            traverseInorder(root.getLeftChild());
        }
        System.out.print(root.getValue() + " -> ");
        if (root.getRightChild() != null) {
            traverseInorder(root.getRightChild());
        }
    }

    ArrayList<Object> breadthFirstArr=new ArrayList<>();

    public ArrayList breadthFirst(Node root){
        if (root!=null){

            Queue<Node> queue=new Queue();
            queue.enqueue(root);
            while (queue.peek()!=null){
                Node front=  queue.dequeue();
                breadthFirstArr.add(front.getValue());
                if (front.getLeftChild() !=null)
                    queue.enqueue(front.getLeftChild());
                if (front.getRightChild() !=null)
                    queue.enqueue(front.getRightChild());

            }
            return breadthFirstArr;
        }
        else return null;
    }


    public boolean isEmpty() {
        return getRoot() == null;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + getRoot() +
                '}';
    }
}
