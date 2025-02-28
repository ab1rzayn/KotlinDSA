//Leetcode 290 . Word Pattern


fun wordPattern(pattern: String, s: String): Boolean {

    //Approaches
    //Edge Case : Return immediately if the length of pattern and s is not equal
    val words = s.split(" ")
    if(pattern.length != words.size) return false

    //Create a map to store the mapping from pattern characters to words.
    val map = HashMap<Char, String>()
    for (i in pattern.indices){
        val currentChar = pattern[i]

        //If the character is already in the map
        if(map.containsKey(currentChar)){

            //Check if the word in the map is the same as the current word
            if(map[currentChar] != words[i]){
                return false //If it is not the same, return false
            }

            // if the current word doesn't exist in the map then add the word to the map
        }else {
            // If the character is not in the map, check if the word is already mapped to another character
            if(map.containsValue(words[i])){
                return false
            }

            map.put(currentChar, words[i])      //This is responsible for putting the key,value,[like on array1, for a[key], we get dog[value] ]
        }
    }
    return true

}



fun main(){
    val pattern = "aabbcc"
    val s = "dog dog cat cat meow meow"
    println(wordPattern(pattern,s))
}
