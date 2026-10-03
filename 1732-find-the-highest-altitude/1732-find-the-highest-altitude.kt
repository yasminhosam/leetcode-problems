class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var currentAltitude=0
        var highest=0

        for(g in gain ){
            currentAltitude+=g
            highest=maxOf(currentAltitude, highest)
        }
        return highest

    }
}