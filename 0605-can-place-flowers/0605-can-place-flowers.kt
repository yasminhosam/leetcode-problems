class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if(n==0) return true
        var flower = n
        
        for( i in 0 until flowerbed.size){
            val left = if(i==0) 0 else flowerbed[i-1]
            val right=if(i== flowerbed.size-1) 0 else flowerbed[i+1]
            if(left == 0 && flowerbed[i] == 0 && right == 0) {
                flowerbed[i] =1
                flower--
            }
            if(flower==0) return true 
        }
        
        return false
        
    }
}