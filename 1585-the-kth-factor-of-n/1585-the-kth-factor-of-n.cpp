class Solution {
public:
    int kthFactor(int n, int k) {
        multiset<int> factors;
        int cnt_factors=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                factors.insert(i);

                }else{
                    factors.insert(i);
                    factors.insert(n/i);
                }
            }
        }
        if (k > factors.size()) return -1;
        auto it=factors.begin();
        advance(it, k-1);
        return *it;
    }
};