fun isIsomorphic(s: String, t: String): Boolean {
    //converting the strings to char arrays
    val sArr = s.toCharArray()
    val tArr = t.toCharArray()

    //Creating an empty hashmap
    val map = HashMap<Char, Char>()

    //If the size of the two strings are not equal, return false
    if (sArr.size != tArr.size) return false

    //Iterating through the strings[S]
    for (i in sArr.indices) {
        //If the map contains the key, check if the value is equal to the value in the tArr
        if (map.containsKey(sArr[i])) {
            if (map[sArr[i]] != tArr[i]) {
                return false
            }
        } else {
            if (map.containsValue(tArr[i])) {
                return false // If tArr[i] is already a value, return false
            }
            map.put(sArr[i], tArr[i])  // at first unique key-value appear, map will be empty, so we will add the first key-value pair
        }
    }
    return true
}

fun main(){
    println(isIsomorphic("egg", "add")) //true
    println(isIsomorphic("foo", "bar")) //false
    println(isIsomorphic("paper", "title")) //true
    println(isIsomorphic("ab", "aa")) //false
    println(isIsomorphic("ab", "ca"))
}
