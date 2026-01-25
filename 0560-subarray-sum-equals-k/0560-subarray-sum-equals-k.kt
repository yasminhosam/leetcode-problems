class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val prefixSumMap = mutableMapOf<Int, Int>()
        var currentSum=0
        var totalSubarrays=0
        for(i in nums.indices){
            currentSum +=nums[i]
            if(currentSum ==k){
                totalSubarrays++
            }
            val remaining = currentSum - k
            if(prefixSumMap.containsKey(remaining)){
                 totalSubarrays+= prefixSumMap[remaining]!!
            }
           val currentFrequency = prefixSumMap.getOrDefault(currentSum, 0)
            prefixSumMap[currentSum] = currentFrequency + 1
        }
        
        return totalSubarrays
    }
}