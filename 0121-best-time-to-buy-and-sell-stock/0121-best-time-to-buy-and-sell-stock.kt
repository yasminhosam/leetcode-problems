class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit=0
        var l=0
        var r=1
        while(r<prices.size){
            if(prices[l] < prices[r]){
               val profit=prices[r]-prices[l]
                    maxProfit=max(maxProfit,profit)
            }else{
                l=r
            }
            r++
            
        }
        return maxProfit
    }
}