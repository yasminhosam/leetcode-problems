class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val sortedS =s.toCharArray()
        val sortedT = t.toCharArray()
        sortedS.sort()
        sortedT.sort()
        for(i in 0 until s.length){
            if(sortedS[i]!=sortedT[i]) return false
        }
        return true
    }
}