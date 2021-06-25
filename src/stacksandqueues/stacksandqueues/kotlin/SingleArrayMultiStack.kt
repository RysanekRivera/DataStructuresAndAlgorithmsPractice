package stacksandqueues.stacksandqueues.kotlin

import java.util.*

class SingleArrayMultiStack(
    var stackSize: Int,
    var numberOfStacks: Int = 3,
) {
    private val sizes:Array<Int?> = arrayOfNulls(numberOfStacks)
    private val values: Array<Int?> = arrayOfNulls(stackSize * numberOfStacks)
    
    fun isFull(stackNum: Int): Boolean{
        return sizes[stackNum] == 0
    }
    
    fun isEmpty(stackNum: Int): Boolean {
        return sizes[stackNum] == stackSize
    }
    
    fun indexOfTop(stackNum: Int): Int {
        val offset = stackSize * stackNum
        val size = sizes[stackNum] ?: 0
        return offset + size - 1
    }
    
    fun pop(stackNum: Int): Int{
        if (isEmpty(stackNum)) throw EmptyStackException()
        val topIndex = indexOfTop(stackNum)
        val value = values[topIndex]
        values[topIndex] = 0
        sizes[stackNum]?.dec()
        return value!!
    }
}