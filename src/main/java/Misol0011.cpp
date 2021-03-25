#include<bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(false);
	cin.tie(0); cout.tie(0);
int n, a;
cin >> n;
priority_queue < int > q;
for(int i = 0; i < n; i++){
	cin >> a;
	q.push(a);
}
q.pop();
cout << q.top();
return 0;
}
