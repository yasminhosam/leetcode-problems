class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()
        val first=strs[0]
        val last =strs[strs.size-1]
        var i=0
        while(i< first.length && i< last.length){
            if(first[i]==last[i]){
                i++
            }else{
                break
            }
        }
        return first.substring(0,i)
        
    }
}