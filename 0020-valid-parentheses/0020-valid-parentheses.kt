import java.util.ArrayDeque
class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for(p in s){
            if (p == '(' || p == '{' || p == '[') {
                stack.push(p)
            }else{
                if(p==')' && stack.peek()=='(') stack.pop()
                else if(p=='}' && stack.peek()=='{') stack.pop()
                else if(p==']' && stack.peek()=='[') stack.pop()
                else return false

            }

        }
        return stack.isEmpty()
    }
}