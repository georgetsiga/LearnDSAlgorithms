package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirst {
    public static void main(String[] args) {
        BreathFirst bf = new BreathFirst();
        Node node = bf.initialiseNodes();
        System.out.println("Breath First While Tree Traversal\n");
        bf.breathFirstWhileTreeTraversal(node);
        System.out.println("Breath First Recursive Tree Traversal\n");
        bf.breathFirstRecursiveTreeTraversal(node);
    }

    public Node initialiseNodes() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        a.setNodes(b, c);
        b.setNodes(d, e);
        c.setNodes(f, null);
        return a;
    }

    private void breathFirstWhileTreeTraversal(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.println(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    private void breathFirstRecursiveTreeTraversal(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Node current = queue.remove();
        System.out.println(current.value);
        if (current.left != null) {
            breathFirstRecursiveTreeTraversal(node.left);
        }
        if (current.right != null) {
            breathFirstRecursiveTreeTraversal(node.right);
        }
    }
}
