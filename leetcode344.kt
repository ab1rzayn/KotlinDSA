//Reverse String LeetCode 344


fun main() {
    val s = charArrayOf('h', 'e', 'l', 'l', 'o')
    reverseString(s)
}

fun reverseString(s: CharArray): Unit {

    //Two pointer approach
    var left = 0

    //size of the array
    var right = s.size - 1

    //swap the elements till left is less than right
    //swap the elements at left and right
    //increment left and decrement right
    while (left < right) {

        //swap the elements
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp
        //increment left and decrement right
        left++
        right--
    }

    //print the reversed string
    for (ele in s) {
        print("$ele ")
    }
}
