class Solution {
public:
    vector<int> exclusiveTime(int n, vector<string>& logs) {
        vector<int> freq(n, 0);
        stack<int> st; // saving active function IDs
        int prev = 0;   // last counted timestamp

        for(auto &log : logs){
            int p1 = log.find(':');
            int p2 = log.find(':', p1 + 1);

            int id = stoi(log.substr(0, p1));
            string type = log.substr(p1 + 1, p2 - p1 - 1);
            int time = stoi(log.substr(p2 + 1));

            if(type == "start"){
                if(!st.empty()) 
                    freq[st.top()] += time - prev; 
                st.push(id);
                prev = time;
            } else { // end
                freq[st.top()] += time - prev + 1;
                st.pop();
                prev = time + 1;
            }
        }
        
        return freq;
    }
};