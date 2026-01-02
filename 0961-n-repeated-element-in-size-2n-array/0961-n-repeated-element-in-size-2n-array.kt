class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        for(i in 0 until nums.size-1){
            if(nums[i]==nums[i+1]) return nums[i]
        }
        for(i in 0 until nums.size-2){
             if(nums[i]==nums[i+2]) return nums[i]
        }
       return nums[0]
    }
}