// Maximum Subarray Sum
fun main(){

    //create an array
    val arr = intArrayOf(-3,-2,-2,-3)


    //find the subarray of this programme
    var tempList = mutableListOf<Int>()

    //find the maximum sum of the subarray
    var maxSum = Int.MIN_VALUE

    //iterate through the array
    for (i in arr.indices) {
        //iterate through the array
        for (j in i until  arr.size) {
            //add the elements to the tempList
            tempList.add(arr[j])

            //find the sum of the tempList
            val sum = tempList.sum()

            //find the maximum sum of the subarray
            if (sum > maxSum) {
                maxSum = sum
            }
        }
        //clear the tempList
        tempList.clear()
    }

    //print the maximum sum of the subarray
    println(maxSum)
}