class Solution {
public:
    string fractionToDecimal(int numerator, int denominator) {
        if(numerator ==0) return "0";
        string result ;
        if(numerator <0 ^ denominator <0)
        result+="-";

        long long n=llabs(numerator);
        long long d=llabs(denominator);

        result+=to_string(n/d);

        long long remainder=n%d;
        if(remainder ==0) return result;
        result+=".";

        unordered_map<long long,int> fractionPart ;
        while(remainder !=0){
            //true if the remainder has seen before (repeating)
            if(fractionPart.find(remainder) != fractionPart.end()){
                int indx=fractionPart[remainder];
                result.insert(indx,"(");
                result +=")";
                break;
            }
            //store remainder indx 
            fractionPart[remainder]=result.size();
            remainder*=10;
            result+=to_string(remainder/d);
            remainder %=d;
        }
        return result;
    }
};