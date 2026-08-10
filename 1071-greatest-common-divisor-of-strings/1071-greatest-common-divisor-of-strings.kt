class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) return ""
        val x = gcd(str1.length, str2.length)

        return str2.substring(0,x)
        
    }
    fun gcd(a:Int, b:Int):Int{
        if (b != 0)
            return gcd(b,a%b)
        else
            return a
    }
}