package binarytree;

public class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setNodes(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
