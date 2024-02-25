import java.util.Scanner;

public class Tree {
    private Node rootNode;

    public Tree buildTree() {
        System.out.println("NOTICE: Nodes are entered in Pre-Order");
        System.out.println("NOTICE: If the node does not exist just type '@'");

        Tree tree = new Tree();
        System.out.println("---Entering the values of the nodes---");
        System.out.print("Root Node: ");
        tree.rootNode = treeBuilder();

        return tree;
    }

    private Node treeBuilder() {
        Node node = new Node();

        Scanner stringScanner = new Scanner(System.in);
        String enteredNodeValue = stringScanner.nextLine();

        if (enteredNodeValue.equals("@")) {
            node.value = "@";
        } else {
            node.value = enteredNodeValue;

            System.out.print("Left child of " + node.value + ": ");
            node.leftChildNode = treeBuilder();

            System.out.print("Right child of " + node.value + ": ");
            node.rightChildNode = treeBuilder();
        }
        return node;
    }

    //---------In-Order---------
    public void inOrderTraversal() {
        System.out.println("------------");
        System.out.print("In-Order Traversal: ");
        inOrderTraversalHelper(rootNode);
        System.out.println("");
    }

    private void inOrderTraversalHelper(Node node) {

        if (node.leftChildNode != null ) {
            inOrderTraversalHelper(node.leftChildNode);
        }

        if (!node.value.equals("@")) {
            System.out.print(node.value + " ");
        }

        if (node.rightChildNode != null ) {
            inOrderTraversalHelper(node.rightChildNode);
        }
    }

    //---------Pre-Order---------
    public void preOrderTraversal() {
        System.out.println("------------");
        System.out.print("Pre-Order Traversal: ");
        preOrderTraversalHelper(rootNode);
        System.out.println("");
    }

    private void preOrderTraversalHelper(Node node) {
        if (!node.value.equals("@")) {
            System.out.print(node.value + " ");
        }

        if (node.leftChildNode != null ) {
            preOrderTraversalHelper(node.leftChildNode);
        }

        if (node.rightChildNode != null ) {
            preOrderTraversalHelper(node.rightChildNode);
        }
    }

    //---------Post-Order---------
    public void postOrderTraversal() {
        System.out.println("------------");
        System.out.print("Post-Order Traversal: ");
        postOrderTraversalHelper(rootNode);
        System.out.println("");
    }

    private void postOrderTraversalHelper(Node node) {

        if (node.leftChildNode != null ) {
            postOrderTraversalHelper(node.leftChildNode);
        }

        if (node.rightChildNode != null ) {
            postOrderTraversalHelper(node.rightChildNode);
        }

        if (!node.value.equals("@")) {
            System.out.print(node.value + " ");
        }
    }
}