#include <bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(false);
	cin.tie(0); cout.tie(0);
 string ans = "", num1, num2;
 cin >> num1 >> num2;
        int l = max(num1.length(), num2.length()),
    n1, n2, n3, q=0, k = num1.length()-1, k2 = num2.length()-1;
        for(int i = 0; i < l; i++){
            n1 = 0; n2 = 0;
            if(k >= 0)  n1 = int(num1[k--])-48;
            if(k2 >= 0) n2 = int(num2[k2--])-48;
            n3 = n1 + n2 + q;
            ans += char(n3%10+48);
            q=n3/10;
        }
        while(q > 0){
            ans += char(q%10+48);
            q /= 10;
        }
        reverse(ans.begin(), ans.end());
        cout << ans;
	return 0;
}
