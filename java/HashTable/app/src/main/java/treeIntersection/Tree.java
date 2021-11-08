package treeIntersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tree {
    public static ArrayList treeIntersection(BinaryTree binaryTree1, BinaryTree binaryTree2) {
        if (binaryTree1.root == null || binaryTree2.root == null) return null;
        Map<String,String> storeMap = new HashMap();
        ArrayList<Object> arr = new ArrayList<>();
        for (Object value : binaryTree1.preOrder(binaryTree1.root)) {
            storeMap.put(value.toString(), null);
        }
        for (Object value: binaryTree2.preOrder(binaryTree2.root)) {
            if (storeMap.containsKey(value.toString()) && !arr.contains(value)) arr.add(value);
        }
        return arr;
    }
}
