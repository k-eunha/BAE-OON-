num1 = 0
num2 = 1
num3 = 0
turn = int(input())

if turn == 0:
    print(0)
elif turn == 1:
    print(1)
else:
    for i in range(turn-1):
        num3 = num1 + num2
        num1 = num2
        num2 = num3
    print(num3)