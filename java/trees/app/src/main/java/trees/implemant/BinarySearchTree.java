package trees.implemant;

import trees.implemant.node.Node;

public class BinarySearchTree  <T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public  void insert(T data) {
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
        } else if(data.compareTo(root.getValue()) > 0) {
            if (root.getRightChild() == null) {
                root.setRightChild(node);
            } else {
                insertHelper(data, root.getRightChild());
            }
        }
    }
    public boolean contains( T data )
    {
        return contains( data, root );
    }

    private boolean contains( T data, Node<T> node )
    {
        if( node == null )
            return false;
        int Result = data.compareTo( node.getValue() );
        if( Result < 0 )
            return contains( data, node.getLeftChild() );
        else if( Result > 0 )
            return contains( data, node.getRightChild() );
        else
            return true;
    }
    public Integer findMaxValue() {
        if (isEmpty()) {
            return 0;
        }
        return maxValue(root);
    }

    public Integer maxValue(Node<T> node ) {

        if(node.getRightChild() != null) {
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



    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
