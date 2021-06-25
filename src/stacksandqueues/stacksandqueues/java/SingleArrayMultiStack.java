package stacksandqueues.stacksandqueues.java;

import java.util.EmptyStackException;

public class SingleArrayMultiStack  {
    private int numberOfStacks;
    private int stackCapacity;
    private int [] values;
    private int [] sizes;
    
    public void singleArrayMultiStack(int stackSize){
        numberOfStacks = 3;
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }
    
    public boolean isFull(int stackNum){
        return sizes[stackNum] == 0;
    }
    
    public boolean isEmpty(int stackNum) {
     return sizes[stackNum] == stackCapacity;
    }
    
    private int intIndexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes [stackNum];
        return offset + size - 1;
    }
    
    public int pop(int stackNum){
        if (isEmpty(stackNum)) throw new EmptyStackException();
        int topIndex = intIndexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        
        return value;
    }
    
    public int peek(int stackNum){
        if (isEmpty(stackNum)) throw new EmptyStackException();
        return values[intIndexOfTop(stackNum)];
    }
}
