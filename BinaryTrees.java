import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
    static class Node {// Class Definition
        int data;
        Node left;
        Node right;

        Node(int data) {// Constructor
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {// Static Class for Building The Tree Using Recursion
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void levelOrder(Node root) {// Level Order Traversal Method
        if (root == null) {
            System.out.println("The Root Doesn't Exist");
            return;
        }
        Queue<Node> queue = new LinkedList<>();// Importing Queue Implemented by LinkedList from Built-in Class
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(current.data + " ");
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }

    @SuppressWarnings("static-access")// Don't Mind this, The static-access warning is triggered when a non-static field or method is accessed from a static context.
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root: " + root.data);
        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
