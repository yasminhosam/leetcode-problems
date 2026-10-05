class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val s1 = nums1.toHashSet()
        val s2 = nums2.toHashSet()
        
        return listOf(
            (s1 - s2).toList(),
            (s2 - s1).toList()
        )
    }
}