import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeSystem {
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

    static Scanner scanner = new Scanner(System.in);

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

    public static void manual() {
        System.out.println("Commands:");
        System.out.println("1. Enter 'left' or 'right' to expand the corresponding child node.");
        System.out.println("2. Enter 'add' to add a child node to the selected node.");
        System.out.println("3. Enter 'delete' to delete a child node or the selected node.");
        System.out.println("4. Enter '..' to go back to the parent node.");
        System.out.println("5. Enter 'root' to go back to the root node.");
        System.out.println("6. Enter 'manual' to display this manual again.");
    }

    public static void expandNode(Node node) {
        System.out.println("Enter 'left' or 'right' to expand corresponding child node ('..' to go back):");
        String input = scanner.nextLine();
        if (input.equals("left") && node.left != null) {
            expandNode(node.left);
        } else if (input.equals("right") && node.right != null) {
            expandNode(node.right);
        } else if (input.equals("..")) {
            if (node != null) {
                expandNode(node);
            }
        } else {
            System.out.println("Invalid input or child node doesn't exist.");
        }
    }

    public static void addChild(Node node) {
        if (node == null) {
            System.out.println("Node doesn't exist to add a child to.");
            return;
        }
        if (node.left != null && node.right != null) {
            System.out.println("Node already has maximum children (2).");
            return;
        }
        System.out.print("Enter data for the new child node: ");
        int newData = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Add to left or right? ");
        String side = scanner.nextLine();
        Node newNode = new Node(newData);
        if (side.equalsIgnoreCase("left")) {
            node.left = newNode;
        } else if (side.equalsIgnoreCase("right")) {
            node.right = newNode;
        } else {
            System.out.println("Invalid side input. Child not added.");
        }
    }

    public static void deleteNode(Node parent, Node node) {
        if (node == null) {
            System.out.println("Node doesn't exist to delete.");
            return;
        }
        if (node == parent) {
            System.out.println("Cannot delete the root node.");
            return;
        }
        System.out.print("Delete this node? (yes/no): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            if (parent.left == node) {
                parent.left = null;
            } else if (parent.right == node) {
                parent.right = null;
            }
            System.out.println("Node deleted successfully.");
        } else {
            System.out.println("Node not deleted.");
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        Node current = root;
        //System.out.println("Root: " + root.data);
        //System.out.println("Level Order Traversal:");
        //levelOrder(root);
        manual();
        while (true) {
            System.out.println("\n\nCurrent node: " + current.data);
            System.out.print("Enter command (type 'manual' for commands): ");
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "manual":
                    manual();
                    break;
                case "left":
                    if (current.left != null) {
                        expandNode(current.left);
                    } else {
                        System.out.println("No left child node.");
                    }
                    break;
                case "right":
                    if (current.right != null) {
                        expandNode(current.right);
                    } else {
                        System.out.println("No right child node.");
                    }
                    break;
                case "add":
                    addChild(current);
                    break;
                case "delete":
                    deleteNode(root, current);
                    break;
                case "..":
                    if (current != root) {
                        current = root;
                        System.out.println("Moved to root node.");
                    } else {
                        System.out.println("Already at root node.");
                    }
                    break;
                case "root":
                    current = root;
                    System.out.println("Moved to root node.");
                    break;
                default:
                    System.out.println("Invalid command. Type 'manual' for commands.");
            }
            System.out.println("\nLevel Order Traversal:");
            levelOrder(root);
        }
    }
}
