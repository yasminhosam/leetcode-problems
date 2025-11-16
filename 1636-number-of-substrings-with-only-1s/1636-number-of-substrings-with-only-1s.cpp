class Solution {
public:
    int numSub(string s) {
        long long mod = 1e9 + 7;
        long long ans = 0;
        
        int l=0;
        while(l<s.length()){
            if(s[l]=='0'){
                l++;
                continue;
            }
            int r=l;
            while(r<s.length() && s[r]=='1'){
                r++;
            }
            long long len=r-l;
            ans=(ans+(len*(len+1)/2)%mod)%mod;
            l=r;
            
        }
        return ans;
    }
};