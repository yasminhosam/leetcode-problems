class Solution {
    
    fun maxFrequencyElements(nums: IntArray): Int {
        val freq = IntArray(101)
        for (num in nums) {
            freq[num]++
        }

        val maxFreq = freq.maxOrNull() ?: 0

        var totalFrequency = 0
        for (count in freq) {
            if (count == maxFreq)
                totalFrequency += count
        }
        
        return totalFrequency
    }
}