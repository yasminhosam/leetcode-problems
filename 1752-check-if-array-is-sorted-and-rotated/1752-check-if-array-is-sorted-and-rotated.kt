class Solution {
    fun check(nums: IntArray): Boolean {
        var breaks=0
        //a rotated array can have at most one break
        for(i in 1..nums.size-1){
            if(nums[i-1]> nums[i] ) {
                breaks++
            }
        }
        if(nums[nums.size-1]> nums[0]){
            breaks++
        }
        
        return breaks<=1
    }
}