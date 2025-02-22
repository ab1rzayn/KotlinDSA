//135. LeetCode Candy Problem__


fun candy(ratings:IntArray):Int{
    //Approach :
        // First we will go through left to right
            // Check if the current rating is greater than the previous rating
                // If yes, then we will increment the candy by 1
                // If no, then we will assign the candy to 1
        // Then we will go through right to left
            // Check if the current rating is greater than the previous rating
                // If yes, then we will increment the candy by 1
                // If no, then we will assign the candy to 1
        // Then we will take the maximum of both the arrays and return the sum of the array

    //left array approach
    val size = ratings.size
    val left = IntArray(size)
    val right = IntArray(size)

    //assigning both index 0th element to 1 and last element of array to 1  as they wont have left-right corresponding element
    //to compare
    left[0] = 1
    right[size-1] = 1

    //left to right
    for ( i in 1..<size){
        if(ratings[i] > ratings[i-1]){
            left[i] = left[i-1] + 1
        }else{
            left[i] = 1
        }
    }

    //right to left
    for ( i in size-2 downTo 0){
        if(ratings[i] > ratings[i+1]){
            right[i] = right[i+1] + 1
        }else{
            right[i] = 1
        }
    }

    //taking the maximum of both the arrays and returning the sum of the array also
    //we are taking a variable named sum to denote the total number of candies
    var sum = 0

    for ( i in 0..<size){
        sum = sum + maxOf(left[i],right[i])
    }
    return sum

}

fun main(){
    val ratings = intArrayOf(1,2,2)
    println(candy(ratings))
}
