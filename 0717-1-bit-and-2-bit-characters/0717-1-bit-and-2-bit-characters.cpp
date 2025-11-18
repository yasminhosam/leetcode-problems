class Solution {
public:
    bool isOneBitCharacter(vector<int>& bits) {
        int l=0;
        int n=bits.size();
        while(l<n-1){
            if(bits[l]==1){
                l+=2;
            }
            else{
                l++;
            }
            
        }
        if(l==n-1) return true;
        else return false;
    }
};