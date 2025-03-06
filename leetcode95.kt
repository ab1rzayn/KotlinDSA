
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun inorderTraversalIterative(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    val stack = mutableListOf<TreeNode>()
    var current = root

//    println("Starting iterative inorder traversal")

    while (current != null || stack.isNotEmpty()) {
        // Traverse to the leftmost node
        while (current != null) {
//            println("Pushing node with value ${current.`val`} onto stack")
            stack.add(current)
            current = current.left
        }

//        println("Can't go further left, stack size: ${stack.size}")

        // Process the current node
        current = stack.removeAt(stack.size - 1)
//        println("Popped node with value ${current.`val`} from stack")

        result.add(current.`val`)
        println("Added ${current.`val`} to result, result: $result")

        // Move to the right child
        current = current.right
        println("Moving to right child: ${current?.`val` ?: "null"}")
    }

    println("Traversal complete, final result: $result")
    return result
}

fun main() {
    var root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    root.left?.right?.left = TreeNode(6)
    root.left?.right?.right = TreeNode(7)
    root.right?.right = TreeNode(8)
    root.right?.right?.left = TreeNode(9)
    println(inorderTraversalIterative(root))
}
