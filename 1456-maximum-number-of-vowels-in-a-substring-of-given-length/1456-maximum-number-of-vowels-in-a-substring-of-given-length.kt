class Solution {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')

        var cnt=0
        
        for(i in 0 until k ){
            if(vowels.contains(s[i])) cnt++
        }
        
        var maxCnt=cnt

        var l=0
        var r=k
        while(r<s.length){

            if(vowels.contains(s[l])) cnt--

            if(vowels.contains(s[r])) cnt++
              
            maxCnt=maxOf( cnt , maxCnt)
            r++
            l++
        }
        return maxCnt
        
    }
}