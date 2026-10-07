class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        val freq1=HashMap<Char,Int>()
        val freq2=HashMap<Char,Int>()

        for(w1 in word1) freq1[w1]=freq1.getOrDefault(w1, 0) + 1
        for(w2 in word2) freq2[w2]=freq2.getOrDefault(w2, 0) + 1

        if (freq1.keys != freq2.keys) return false

        return freq1.values.sorted() == freq2.values.sorted()
        
    }
}