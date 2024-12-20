/*
13. Roman to Integer
Easy
Topics
Companies
Hint
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */



fun main(){
    val s = "MCMXCIV"
    println(romanToInt(s))
}

fun romanToInt(s: String): Int {

    //Mapping Roman Numerals to Integers
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    //Converting the Input String to a Character Array:
    val charArray = s.toCharArray()


    //Initializing the Result
    var result = 0

    //Iterating through the Character Array
    for (i in charArray.indices) {
        //Getting the Current and Next Roman Numerals
        val current = romanMap[charArray[i]]!!
        val next = if (i + 1 < charArray.size) romanMap[charArray[i + 1]]!! else 0

        //Checking if the Current Roman Numeral is less than the Next Roman Numeral
        //If it is, then we subtract the Current Roman Numeral from the Result
        //Otherwise, we add the Current Roman Numeral to the Result
        if (current < next) {
            result -= current
        } else {
            result += current
        }
    }

    return result


}