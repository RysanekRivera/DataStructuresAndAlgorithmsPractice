package problems.closestvalueinbst

import kotlin.math.abs

open class BST(var value: Int) {
    var left: BST? = null
    var right: BST? = null
}

fun closestValueInBST(tree: BST, target:Int): Int {
    return findClosestValueInBstHelper(tree, target, tree.value)
}

fun findClosestValueInBstHelper(tree: BST, target: Int, closest: Int): Int {
    var newClosest = closest
    
    if (abs(target - closest) > abs(target - tree.value)) {
        newClosest = tree.value
    }
    return if (target < tree.value && tree.left != null) {
        findClosestValueInBstHelper(tree.left!!, target, newClosest)
    } else if (target > tree.value && tree.left != null) {
        findClosestValueInBstHelper(tree.right!!, target, newClosest)
    } else {
        newClosest
    }
}