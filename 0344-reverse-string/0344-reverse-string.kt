class Solution {
    fun reverseString(s: CharArray): Unit {
        // s.reverse()
        var l=0
        var r=s.size-1
        while(l<r){
            val tmp=s[l]
            s[l]=s[r]
            s[r]=tmp
            l++
            r--
        }
    }
}