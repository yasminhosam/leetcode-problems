class Solution {
    fun maxArea(height: IntArray): Int {
        var i=0
        var j=height.size - 1
        var maxArea=0
        while(i<j ){
            val area =(j-i)* min(height[i],height[j])
            maxArea = maxOf(maxArea, area)
            if(height[i] < height[j]) i++
            else j--
        }
        return maxArea
    }
}