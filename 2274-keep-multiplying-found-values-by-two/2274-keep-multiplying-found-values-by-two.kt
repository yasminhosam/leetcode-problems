class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        var result=original
        nums.sort()
        for(num in nums){
            if(num == result) 
            result=result *2
        }
        return result 
    }
}