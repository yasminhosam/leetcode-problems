class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var l=0
        var r=0 
        var ans=0
        var zeroCnt=0

        while(r<nums.size){
            if(nums[r]==0) zeroCnt++
            while(zeroCnt>1){
                if(nums[l]==0) zeroCnt--
                l++
            }
            ans = maxOf(r - l, ans)
            r++
        }
        return ans
        
    }
}