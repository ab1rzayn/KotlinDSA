/*
19. Remove Nth Node From End of List
Medium
Topics
Companies
Hint
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main(){

    //run a test case
    val head = ListNode(1)

    val n = 1

    //print the result
    var result = removeNthFromEnd(head, n)
    while(result != null){
        println(result.`val`)
        result = result.next
    }
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    //create a temp node
    var temp = ListNode(0)
    temp.next = head
    var first: ListNode? = temp
    var second: ListNode? = temp

    //find the nth Index 
    for(i in 1..n+1){
        first = first?.next
    }

    //push the nth Index node into the temp
    while(first != null){
        first = first?.next
        second = second?.next
    }

    //remove the nth Index node
    second?.next = second?.next?.next

    //return the list
    return temp.next

}