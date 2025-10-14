class Solution {
public:
    bool hasIncreasingSubarrays(vector<int>& nums, int k) {
        int n=nums.size();
        for(int i=0;i+2*k <=n;i++){
            if(isStrictlyIncreasing(nums,i, i+k-1) &&
            isStrictlyIncreasing(nums,i+k, i+2*k-1)){
                return true;
            }
        }
        return false;
    }
    bool isStrictlyIncreasing(vector<int> nums,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i]>=nums[i+1])
            return false;
        }
        return true;
    }

};