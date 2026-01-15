class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var k=(k%nums.size)
        nums.reverse()
        nums.reverse(0,k)
        nums.reverse(k,nums.size)
        
    }
}