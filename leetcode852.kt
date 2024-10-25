/*
852. Peak Index in a Mountain Array
Medium
Topics
Companies
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.
*/



fun main() {
    val arr = intArrayOf(0, 10, 5, 2)
    println(peakIndexInMountainArray(arr))

}
fun peakIndexInMountainArray(arr: IntArray): Int {
    //Binary Search
    var low = 1
    var high = arr.size - 2
    //Considering the mid will be the peak element.
    var mid: Int



    // What is the peak element?
    // The peak element is the element which is greater than its neighbours.
    // means on the [left < mid] and on the [mid >right].
    // keep divide and search until the peak element is found.



    while (low <= high) {
        mid = low +(high - low) / 2

        if( (arr[mid]>arr[mid+1]) && (arr[mid]>arr[mid-1]) ){
            return mid
        }
        else if(arr[mid]<arr[mid+1]){
            low = mid + 1
        }else{
            high = mid - 1
        }
    }
    return -1

}
