num = input().split()

asc = ['1','2','3','4','5','6','7','8']
desc = sorted(asc, reverse=True)

if num==asc:
    print('ascending')
elif num==desc:
    print('descending')
else :
    print('mixed')