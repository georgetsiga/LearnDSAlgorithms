package binarytree

import java.util.*

class BreathFirstKt {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val breathFirstKt = BreathFirstKt()
            val node = breathFirstKt.initialiseNodes()
            breathFirstKt.breathFirstWhileTreeTraversal(node)
        }
    }

    fun initialiseNodes(): Node {
        val a = Node("a")
        val b = Node("b")
        val c = Node("c")
        val d = Node("d")
        val e = Node("e")
        val f = Node("f")
        a.setNodes(b, c)
        b.setNodes(d, e)
        c.setNodes(f, null)
        return a
    }

    fun breathFirstWhileTreeTraversal(node: Node) {
        val queue: Queue<Node> = LinkedList()
        queue.add(node)
        while (queue.isNotEmpty()) {
            val current = queue.remove()
            println(current.value)
            if (current.left != null) {
                queue.add(current.left)
            }
            if (current.right != null) {
                queue.add(current.right)
            }
        }
    }
}