class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var l=0
        var r = nums.size - 1
        var cntPaired=0

        while(l<r){
            val sum = nums[l] + nums[r]
            if (sum == k) {
                l++
                r--
                cntPaired++
            } 
            else if (sum < k)  l++
            else  r--
        }
        return cntPaired
    }
}