class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        for(num in nums){
            map[num]=map.getOrDefault(num,0)+1
        }
        for(key in map.keys){
            if(map.get(key)!! > nums.size/2)
                return key
        }
        return -1
    }
}