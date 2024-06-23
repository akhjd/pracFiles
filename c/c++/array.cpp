#include <vector>
#include <iostream>
using namespace std;
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        int iter;
        for(int i=0;i<sizeof(nums);i++){
            iter=0;
            for(int j=0;j<sizeof(nums);j++){
                if(nums[i]==nums[j]){
                    iter++;
                }
            }
            if(iter>1){
                break;
            }
        }
        if(iter>1){
            return true;
        }else{
            return false;
        }
    }
};
int main(){
    vector<int> input;
    int a,n,b=0;
    cin>>n;
    while(b<n){
        cin>>a;
        input.push_back(a);
        b++;
    }
    Solution sol;
    cout<<sol.containsDuplicate(input);
    return 0;
}