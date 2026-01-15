class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i=0
        for(j in 1..nums.size-1){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j]
                i++
            }
        }
        return i+1
        
    }
}