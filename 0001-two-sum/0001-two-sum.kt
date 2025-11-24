class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       val arr=nums.mapIndexed{index,value -> Pair(value,index)}.sortedBy{it.first}
        var l=0
        var r=arr.size-1
       
        while(l<r){
            val sum=arr[l].first+arr[r].first
    
            if(sum>target) r--
            else if(sum<target) l++
            else {
                return intArrayOf(arr[l].second,arr[r].second)
            }
        }
        return intArrayOf()
    }
}