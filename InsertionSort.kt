//Insertion Sort
//Time Complexity
    //Best Case: O(n)
    //Average Case: O(n^2)
    //Worst Case: O(n^2)

//Space Complexity: O(1)

// Insertion Sort > Bubble sort
    //Fewer Comparisons and Swaps:
    // Better TC on Best Case.
    // Stable Sort



class Solution2 {
    fun main() {
        val arr = intArrayOf(5, 3, 1, 3, 4, 2)
        val n = arr.size

        //Starts from 1 till n
        for (i in 1 until n) {
            var j = i


            //Compares and swaps elements to place the
            // current element in its correct position in the sorted part of the array.

            while (j >= 1) {
                //it checks if the current element is greater than or equal to the previous element
                //if its true then it breaks the loop
                if (arr[j] >= arr[j - 1]) break

                //if the current element is less than the previous element then it swaps the elements
                if (arr[j] < arr[j - 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j - 1]
                    arr[j - 1] = temp
                }

                //decrements the value of j
                j--
            }
        }

        for (ele in arr) {
            print("$ele ")
        }
    }
}

fun main() {
    val solution2 = Solution2()
    solution2.main()
}
