from decimal import Decimal

S = Decimal('0')
[w, h, d] = map(int, input().split())
n_x = w // d
n_y = h // d
x = (w - n_x * d)
y = (h - n_y * d)
S = (n_x * n_y * d * d) / 2
if y >= (d / 2):
    S += n_x * (d * d / 2 - (d - y) * (d - y))
else:
    S += n_x * y * y
if x >= d / 2:
    S += n_y * (d * d / 2.0 - (d - x) * (d - x))
else:
    S += n_y * x * x
if y >= d / 2 and x >= d / 2:
    if (2 * d - x - y) < d / 2:
        S += d * d / 2.0 - (d - y) * (d - y) - (d - x) * (d - x)
    else:
        S += d * d / 2 - (d - y) * (d - y) - (d - x) * (d - x) + (1.5 * d - x - y) * (1.5 * d - x - y) / 2

elif (y > d / 2 and x < d / 2):
    if (x + d - y) >= d / 2:
        S += x * x - (0.5 * d + x - y) * (0.5 * d + x - y) / 2
    else:
        S += x * x
elif (x >= d / 2 and y <= d / 2):
    if ((y + d - x >= d / 2)):
        S += (y * y - (0.5 * d + y - x) * (0.5 * d + y - x) / 2.0)
    else:
        S += y * y

elif (x <= d / 2 and y <= d / 2):
    if (x + y >= d / 2):
        S += (x + y - d / 2) * (x + y - d / 2) / 2

print(f"{S:.4f}")
