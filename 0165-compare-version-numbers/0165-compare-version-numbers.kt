class Solution {
    fun compareVersion(version1: String, version2: String): Int {
        val v1 = version1.split(".").map { it.toInt() }.toMutableList()
        val v2 = version2.split(".").map { it.toInt() }.toMutableList()

        while(v1.size < v2.size ){
            v1.add(0)
        }

        while(v2.size < v1.size ){
            v2.add(0)
        }

       
        for (i in v1.indices){
            if(v1[i]<v2[i] ) return -1
             if(v1[i] > v2[i])  return 1
        }
        return 0
       
    }
}