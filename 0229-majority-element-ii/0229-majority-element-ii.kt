class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        var cand1=0
        var cnt1 = 0
        var cand2=0
        var cnt2=0
        

        for(i in nums.indices){
            when {
            nums[i] == cand1 -> cnt1++
            nums[i] == cand2 -> cnt2++
            cnt1 == 0 -> {
                cand1 = nums[i]
                cnt1 = 1
            }
            cnt2 == 0 -> {
                cand2 = nums[i]
                cnt2 = 1
            }
            else -> {
                cnt1--
                cnt2--
            }
            }
        }
            var resultCnt1=0
            var resultCnt2=0
            for(num in nums){
                if(num == cand1) resultCnt1++
               else if(num == cand2) resultCnt2++
            }
            val resultList= mutableListOf<Int>()
            val n = nums.size

            if(resultCnt1 > n/3) resultList.add(cand1)
            if( resultCnt2 > n/3) resultList.add(cand2)
            return resultList

        



// TC O(n),SC O(n)
        // val numsMap= mutableMapOf<Int,Int>()

        // for(num in nums){
        //     numsMap[num]= numsMap.getOrDefault(num,0)+1
        // }
        // val numsList = mutableListOf<Int>()
        // val n=nums.size
        // for(entry in numsMap){
        //     if(entry.value > n/3)
        //     numsList.add(entry.key)
        // }
        // return numsList
    }
}