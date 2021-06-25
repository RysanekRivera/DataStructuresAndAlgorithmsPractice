package problems.sortedsquarearray

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 9)
    val arr1 = arrayOf(1)
    val arr2 = arrayOf(1, 2)
    val arr3 = arrayOf(1, 2, 3, 4, 5)
    val arr4 = arrayOf(10)
    val arr5 = arrayOf(-1)
    val arr6 = arrayOf(-2, -1)
    val arr7 = arrayOf(-5, -4, -3, -2, -1)
    val arr8 = arrayOf(-10, -5, 0, 5, 10)
    val arr9 = arrayOf(-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20)
    
    val list: List<Array<Int>> = listOf(arr, arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9)
    
    
    for (array in list){
        println(sortedSquareArray(array))
    }
}

fun sortedSquareArray(array: Array<Int>): List<Int> {
    val squared = array.map { _ ->
        0
    }.toMutableList()
    
    for (int in array.indices) {
        val value = array[int]
        squared[int] = value * value
    }
    
    squared.sort()
    
    return squared
}