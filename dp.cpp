#include <iostream>
#include <vector>
#include <string>
#include <cmath> 
#include <set>
#include <bits/stdc++.h>


using namespace std;

typedef vector<int> vi; 
typedef vector<vi> vvi;
typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef long long ll;
typedef vector<ll> vll;
typedef vector<vll> vvll;
typedef long double ld;
typedef pair<ll, ll> pll;
typedef vector<bool> vb;



int main()
{
    // freopen("billboard.in", "r", stdin); 
    // freopen("billboard.out", "w", stdout);
    int t;
    cin >> t;
    while (t--) {
        int n = 0;
        cin >> n;
        vector<vector<int>> a;
        for(int i = 0; i < n; i++){
            vector<int> b;
            string in;
            cin >> in;
            for(int j = 0; j < n; j++){
                b.push_back(in[j]-'0');
            }
            a.push_back(b);
        }
        
        bool brea = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i][j] == 1){
                    if(i != n-1 && j != n-1){
                        if(a[i+1][j] == 0 && a[i][j+1] == 0){
                            cout << "NO" << endl;
                            brea = true;
                            break;
                        }
                    }
                }
            }
            if(brea){
                break;
            }
        }
        if(!brea){
            cout << "YES" << endl;
        }
    }
    
   
}