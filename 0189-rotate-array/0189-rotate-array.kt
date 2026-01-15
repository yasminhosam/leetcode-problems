class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n=nums.size
        val shifts=k%n
       val rotated = IntArray(n)
        for(i in 0..n-1){
            rotated[(i+shifts) %n]=nums[i]
        }
        for(i in 0..n-1){
            nums[i]=rotated[i]
        }
        
    }
}