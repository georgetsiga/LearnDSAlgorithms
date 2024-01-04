package binarytree;

import java.util.Stack;

public class DepthFirst {
    public static void main(String[] args) {
        DepthFirst df = new DepthFirst();
        Node node = df.initialiseNodes();
        df.depthFirstTreeTraversal(node);
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

    public void depthFirstTreeTraversal(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            System.out.println(currentNode.value);
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
    }
}
