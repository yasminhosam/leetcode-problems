class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        vector<string> result;
        string row1 = "qwertyuiop";
        string row2 = "asdfghjkl";
        string row3 = "zxcvbnm";

        for(string word : words){
            string lowerWord="";
            for(char c:word){
                lowerWord+=tolower(c);
            }
            string row;
            if (row1.find(lowerWord[0]) != string::npos)
                row = row1;
            else if (row2.find(lowerWord[0]) != string::npos)
                row = row2;
            else
                row = row3;

            bool valid = true;

            for(char c:lowerWord){
                if(row.find(c) == string::npos){
                    valid=false;
                    break;
                }
            }
            if(valid){
                result.push_back(word);
            }
        }
        return result;

    }
};