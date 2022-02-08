num1 = list(map(int, input().split()))
num2 = []

for i in range(len(num1)):
    num2.append(num1[i]*num1[i])

num3 = sum(num2)

print(num3%10)