class Solution {
public:
    bool kLengthApart(vector<int>& nums, int k) {
        
        int l=-1,r=0;
        while(r<nums.size()){
            if(nums[r]==1){
                if(l !=-1){
                    if(r-l-1 < k)
                     return false;
                }
                l=r;
                
            }
            r++;

        }
        return true;
    }
};