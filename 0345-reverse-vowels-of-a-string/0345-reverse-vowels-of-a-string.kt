class Solution {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val charArray=s.toCharArray()
        var l=0
        var r=s.length-1
        while(l<r){
            while (l < r && !vowels.contains(charArray[l])) {
                l++
            }
            
            while (l < r && !vowels.contains(charArray[r])) {
                r--
            }
            if(l<r){
                var temp =charArray[l]
                charArray[l]=charArray[r]
                charArray[r]=temp 
                l++
                r--
            }
            
        }
      return String(charArray)  
    }
}