class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val freq=HashMap<Int,Int>()
        for(a in arr ){
            freq[a]=freq.getOrDefault(a, 0)+1
        }
        val occurrences = HashSet<Int>()
        for(entry in freq){
            if(!occurrences.add(entry.value)){
                return false
            }
        }
        return true
    }
}