fun main() {

    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val eleToSearch = 8
    var result = binarySearchIterative(arr, eleToSearch)

    if (result == -1){
        println("Element not found")
    }else{
        println("Element found at index: $result")
    }
}

fun binarySearchIterative(arr:IntArray, eleToSearch:Int):Int{
    var low =0;
    var high = arr.size-1;
    var mid:Int

    //Iterative Binary Search
    //Time Complexity: O(log n)
    //Space Complexity: O(1)


    while (low <= high){
        //getting the mid
        mid = low + (high - low) / 2;

        //when the element is found
        if (arr[mid] == eleToSearch){
            return mid;
        }
        //if the element to search is greater than the mid
        //then increase the low & when the element to search
        //is less than the mid then decrease the high
        if (arr[mid] < eleToSearch){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }
    return -1;
}