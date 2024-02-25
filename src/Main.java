public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree = tree.buildTree();

        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
    }
}