
//Selection Sort in Kotlin. Selection sort is a simple sorting algorithm.
// This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts,
// the sorted part at the left end and the unsorted part at the right end.
// Initially, the sorted part is empty and the unsorted part is the entire list.

// The problems in Selection Sort is even in the best case
// the time complexity will be 0(n2)

class Solution1 {
    fun main() {
        val arr = intArrayOf(5, 3, 1, 4, 2)
        val n = 5

        // Insertion sort
        for (i in 0..<n - 1) {
            var min = Int.MAX_VALUE
            var mindx = -1

            for (j in i..<n) {
                // Find out smallest value, index
                if (arr[j] < min) {
                    min = arr[j]
                    mindx = j
                }
            }
            // Swapping
            val temp = arr[i]
            arr[i] = arr[mindx]
            arr[mindx] = temp
        }

        for (ele in arr) {
            print("$ele ")
        }
    }
}
