class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var j= -1
        for (i in 0 until nums.size){
            if(nums[i] == 0 ){
                j=i
                break;
            }
        }
        if (j == -1) return
        for(i in j+1..nums.size-1){
            if(nums[i] != 0){
                nums[j]=nums[i]
                nums[i]=0
                j++
            }
        }
    }
}