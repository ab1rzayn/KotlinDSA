/*
543. Diameter of Binary Tree
Easy
Topics
Companies
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.
*/


//This is the Tree Node which left and right leaf node could be null
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

//This function which calculate the left depth from the root.
fun leftDepth(node: TreeNode?): Int {
    if (node == null) return 0
    return 1 + leftDepth(node.left)
}

//This function which calculate the right depth from the root.
fun rightDepth(node: TreeNode?): Int {
    if(node == null) return  0
    return 1+ rightDepth(node.right)
}


fun diameterOfBinaryTree(root: TreeNode?): Int {
    //The root is null
    if (root == null) return 0

    //Finding the left diameter
    val leftDiameter = leftDepth(root.left)

    //Finding the right diameter
    val rightDiameter = rightDepth(root.right)
    return  leftDiameter+rightDiameter
}

fun main() {
    // Create the tree using your TreeNode class
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)

    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)


   println(diameterOfBinaryTree(root))
}