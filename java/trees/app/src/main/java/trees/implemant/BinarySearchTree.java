package trees.implemant;

import trees.implemant.node.Node;
import trees.implemant.node.Queue;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BinarySearchTree  <T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void insert(T data) {
        if (isEmpty()) {
            root = new Node<>(data);
        } else {
            insertHelper(data, root);
        }
    }


    private void insertHelper(T data, Node<T> root) {
        Node<T> node = new Node<>(data);
        if (data.compareTo(root.getValue()) < 0) {
            if (root.getLeftChild() == null) {
                root.setLeftChild(node);
            } else {
                insertHelper(data, root.getLeftChild());
            }
        } else if (data.compareTo(root.getValue()) > 0) {
            if (root.getRightChild() == null) {
                root.setRightChild(node);
            } else {
                insertHelper(data, root.getRightChild());
            }
        }
    }

    public boolean contains(T data) {
        return contains(data, root);
    }

    private boolean contains(T data, Node<T> node) {
        if (node == null)
            return false;
        int Result = data.compareTo(node.getValue());
        if (Result < 0)
            return contains(data, node.getLeftChild());
        else if (Result > 0)
            return contains(data, node.getRightChild());
        else
            return true;
    }

    public Integer findMaxValue() {
        if (isEmpty()) {
            return 0;
        }
        return maxValue(root);
    }

    public Integer maxValue(Node<T> node) {

        if (node.getRightChild() != null) {
            return maxValue(node.getRightChild());
        }
        return (Integer) node.getValue();
    }


    public Integer findbreadthFirstTree() {

        return maxValue(root);
    }


    private boolean isEmpty() {
        return root == null;
    }

    public int getSumOdd(Node<Integer> node) {
        int sum = 0;
        if (node != null) {
            if (node.getValue() % 2 != 0) {
                sum += node.getValue();
            }
            sum += getSumOdd(node.getLeftChild());
            sum += getSumOdd(node.getRightChild());
        }
        return sum;
    }
    public static List treeFizzBuzz(Node<Integer> treeRoot) {
        List<String> newList = new ArrayList<>();
        if (treeRoot.value == null) return newList;
        Queue myQueue = new Queue();
        myQueue.enqueue(treeRoot);
        while (!myQueue.isEmpty()) {
            Node <Integer> test = myQueue.dequeue();
            for (int i = 0; i < test.child.size(); i++)
                myQueue.enqueue(test.child.get(i));
            if (test.value % 3 == 0 && test.value % 5 == 0) {
                newList.add("FizzBuzz");
            } else if (test.value % 3 == 0) {
                newList.add("Fizz");
            } else if (test.value % 5 == 0) {
                newList.add("Buzz");
            } else {
                newList.add("\"" + test.value + "\"");
            }
        }
        return newList;
    }

        @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
