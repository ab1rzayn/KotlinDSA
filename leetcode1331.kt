class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {
    //Sorting the array and removing duplicates
    val sortedArr = arr.sorted().distinct()
    
    //Creating a map of the sorted array with the index
    val map = sortedArr.withIndex().associate { it.value to it.index + 1 }
    
    //Returning the rank of the array
    return arr.map { map[it]!! }.toIntArray()
    }
}
