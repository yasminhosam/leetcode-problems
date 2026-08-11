class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max=candies.maxOrNull()
        val result = mutableListOf<Boolean>()
        for(c in candies){
            if(c + extraCandies >= max!!)
                result.add(true)
            else 
                result.add(false)
        }
        
        return result
    }
}