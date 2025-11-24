class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var l= m-1 
        var r=m+n-1
        var i=n-1
       while(i>=0){
        if(l>= 0 && nums1[l] > nums2[i]){
            nums1[r]=nums1[l]
            l--
        }else{
            nums1[r]=nums2[i]
            i--
        }
       
        r--
       }
       
    }
}