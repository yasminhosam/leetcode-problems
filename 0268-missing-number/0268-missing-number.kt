class Solution {
    fun missingNumber(nums: IntArray): Int {
        var xor1=0 
        var xor2=0
        for(i in 0 until nums.size){
            xor1=xor1 xor i
            xor2= xor2 xor nums[i]
        }
        xor1= xor1 xor nums.size
        return xor1 xor xor2
    }
}