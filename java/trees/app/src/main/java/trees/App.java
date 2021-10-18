/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import trees.implemant.BinarySearchTree;
import trees.implemant.BinaryTree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

            BinaryTree<Integer> binarySearchTree=new BinaryTree<>();
            binarySearchTree.insert(5);
            binarySearchTree.insert(7);
            binarySearchTree.insert(6);
            binarySearchTree.insert(10);
            binarySearchTree.insert(2);
            binarySearchTree.insert(8);

            System.out.println("Inorder");
        binarySearchTree.preorderTraversal();
            System.out.println("\n----------Preorder ----------");
            binarySearchTree.preorderTraversal();
            System.out.println("\n---------- Postorder ---------");
            binarySearchTree.postorderTraversal();
            System.out.println("\n");
            System.out.println(binarySearchTree.contains(10));
        }

    }

