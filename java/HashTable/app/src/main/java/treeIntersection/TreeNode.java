package treeIntersection;

public class TreeNode<V> {
    public V value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(V value) {
        this.value = value;
    }

    public TreeNode(V value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
