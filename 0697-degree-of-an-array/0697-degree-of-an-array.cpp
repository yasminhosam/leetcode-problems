class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        unordered_map<int, int> count;
        unordered_map<int, int> first;
        unordered_map<int, int> last;
        int degree=0;
        for(int i=0;i<nums.size();i++){
            int x=nums[i];
            if(count[x]==0){
                first[x]=i;
            }
            count[x]++;
            last[x]=i;
            degree=max(degree,count[x]);
        }
       int minLen = INT_MAX;
        for(int i=0;i<nums.size();i++){
            int x=nums[i];
            if(count[x]==degree){
                minLen=min (minLen, last[x]-first[x]+1);

            }
        }
        return minLen;

        
    }
};