class Solution {
    fun removeStars(s: String): String {
        val stack = ArrayDeque<Char>()
        for (i in s.indices){
            if(s[i]=='*') stack.removeLast()
            else stack.addLast(s[i])
        }
        return stack.joinToString("")
    }
}