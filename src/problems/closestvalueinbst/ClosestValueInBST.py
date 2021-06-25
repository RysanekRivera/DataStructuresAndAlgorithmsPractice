# avg O(Log(n)) where n is the number of nodes. It's log of n because you eliminate half of the tree | O(n)
def closest_value_in_bst_recursive(tree, target):
    return findClosestValueInBstHelper(tree, target, float("inf"))


# Average: O(log(n)) time | O(log(n) space
# worst: O(n) time | O(n) space
def findClosestValueInBstHelper(tree, target, closest):
    if tree is None:
        return closest
    if abs(target - closest) > abs(target - tree.value):
        closest = tree.value
    if target < tree.value:
        return findClosestValueInBstHelper(tree.left, target, closest)
    elif target > tree.value:
        return findClosestValueInBstHelper(tree.right, target, closest)
    else:
        return closest


# Average: O(log(n)) time | O(log(1) space
# worst: O(n) time | O(1) space
def closest_value_in_bst_iteratively(tree, target):
    return findClosestValueInBstHelper(tree, target, float("inf"))


def findClosestValueInBstHelperIteratively(tree, target, closest):
    currentNode = tree
    while currentNode is not None:
        if abs(target - closest) > abs(target - tree.value):
            closest = currentNode.value
        if target < tree.value:
            currentNode = currentNode.left
        elif target > currentNode.value:
            currentNode = currentNode.right
        else:
            break
    return closest
