fun canConstruct(ransomNote: String, magazine: String): Boolean {
    //convert magazine to char array
    val magazineArr = magazine.toCharArray()

    //iterate through ransomNote
    for(i in ransomNote.indices){
        //taking a temp variable initialized to false and if we find the character in magazineArr we set it to true
        var found =false

        //iterate through magazineArr
        for(j in magazineArr.indices){
            //if we find the character in magazineArr we set it to ' ' and set found to true
            if(magazineArr[j] == ransomNote[i]){
                magazineArr[j] = ' '
                found = true
                break  //any false output will break the loop
            }
        }
        if(!found){
            return false
        }
    }
    return true
}

fun main(){
    println(canConstruct("aa","bbbb"))
}
