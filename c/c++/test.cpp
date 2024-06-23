#include <iostream>
using namespace std;
int main(){
    int a,b,count=0;
    cin>>a;
    cin>>b;
    while(a!=b){
        if(a>b){
            a=a-b;
        }else if(b>a){
            b=b-a;
        }
        count++;
    }
    cout<<count<<'\n'<<a<<' '<<b;
}