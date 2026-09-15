class Solution {
    fun reverseWords(s: String): String {
        val reversed=s.reversed()
        var result=""
    
        var i=0
        while(i<reversed.length){
            if(reversed[i]==' '){ 
                ++i
                continue
            }
            var word=""
            while(i < reversed.length && reversed[i] != ' '){
                 word+=reversed[i]
                ++i
            }
            result+=word.reversed() +" "
        }
        return result.trim()
    }
}