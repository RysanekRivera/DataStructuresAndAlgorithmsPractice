package problems.branchsums

open class BinaryTree(var value: Int) {
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun branchSums(root: BinaryTree): List<Int> {
    val sums = mutableListOf<Int>()
    calculateBranchSums(root, 0 , sums) // recursive function
    return sums
}

fun calculateBranchSums(node: BinaryTree?, runningSum: Int, sums: MutableList<Int>) {
    if (node == null) return
    
    val newRunningSum = runningSum + node.value
    if (node.left == null && node.right == null) {
        sums.add(newRunningSum)
        return
    }
    
    calculateBranchSums(node.left, newRunningSum, sums)
    calculateBranchSums(node.right, newRunningSum, sums)
}