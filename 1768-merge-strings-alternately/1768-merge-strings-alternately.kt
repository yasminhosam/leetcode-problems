class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var w1=0
        var w2=0
        var result=""
        
        while(w1 < word1.length || w2 < word2.length){
            if(w1 < word1.length){
                result+=word1[w1]
                w1++
            }
            if(w2 < word2.length){
                result+=word2[w2]
                w2++
            }
        }
        return result
        
        
    }
}