#include <bits/stdc++.h>
#define ll unsigned long long
using namespace std;
ll toLong(string s)
{
    ll ans = 0;
    for (int i = 0; i < s.length(); i++)
    {
        ans *= 10;
        ans += int(s[i]) - 48;
    }
    return ans;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    while (t--)
    {
        string s, str = "";
        cin >> s;
        int n = s.length();
        bool res = false;
        for (int i = 0; i < min(n, 17) - 1; i++)
        {
            str += s[i];
            ll N = toLong(str);
            string z = "";
            while (z.length() < n)
            {
                z += to_string(N++);
            }
            if (z == s && z.length() == n)
            {
                cout << "YES " << str << "\n";
                res = true;
                break;
            }
        }
        if (!res)
            cout << "NO"
                 << "\n";
    }
    return 0;
}
