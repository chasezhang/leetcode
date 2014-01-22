bool isValid(string s) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        stack<char> stk;
        
        for(int i=0; i<s.size(); i++) {
            if(s[i] == '(' || s[i] == '[' || s[i] == '{') {
                stk.push(s[i]);
            }
            if(s[i] == ')' || s[i] == ']' || s[i] == '}') {
                if (stk.empty()) return false;
                
                char tmp = stk.top();
                stk.pop();
                if (tmp == '(' && s[i]!=')') return false;
                if (tmp == '[' && s[i]!=']') return false;
                if (tmp == '{' && s[i]!='}') return false;
            }
        }
        if (!stk.empty()) return false;
        return true;
    }