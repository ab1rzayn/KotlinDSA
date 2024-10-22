/*
561. Array Partition
Easy
Topics
Companies
Hint
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
Example 1:

Input: nums = [1,4,3,2]
Output: 4
Explanation: All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.
 */

fun main(){
    val nums = intArrayOf(6,2,6,5,1,2)
    println(arrayPairSum(nums))
}

fun arrayPairSum(nums: IntArray): Int {

    //sort the array
    val sortedNums = nums.sortedArray()

    //create a sum
    var sum = 0

    //iterate through the array with 2 steps
    for (i in sortedNums.indices step 2){
            sum += sortedNums[i]

    }
        return sum

}

