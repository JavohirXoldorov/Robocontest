n,k = map(int, input().split())
M = int(1e9+7)
a = pow(k, n, M)-1
b = pow(k-1, M-2, M)
print((a*b)%M)
