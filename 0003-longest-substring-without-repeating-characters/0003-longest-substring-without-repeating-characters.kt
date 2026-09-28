class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n=s.length
        val seen = HashSet<Char>()
        var maxLen=0

        var l=0
        var r=0
         while (r < n) {
            while (seen.contains(s[r])) {
                seen.remove(s[l])
                ++l
            }
            seen.add(s[r])
            maxLen=max(maxLen,r -l+1)
            ++r
        }
        return maxLen
        
    }
}