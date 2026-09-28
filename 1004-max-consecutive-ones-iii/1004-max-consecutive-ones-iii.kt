class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var l=0
        var r=0
        var zeroCnt=0
        var ans=0
        while(r<nums.size){
            if(nums[r]==0) zeroCnt++
            while(zeroCnt >k ){
                if(nums[l]==0) zeroCnt--
                l++
            }
            ans=maxOf(r-l+1,ans)
            r++
            
        }
        return ans

        
    }
}