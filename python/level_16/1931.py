# -*- coding: utf-8 -*-
"""1931

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1hjGmjusIpc8h-tgn1eGkh1pT0S47z7cY
"""

num = int(input())
time = []
for i in range(num):
  start, finish = map(int, input().split())
  time.append((start, finish))

time = sorted(time, key = lambda a : a[0])
time = sorted(time, key = lambda a : a[1])

end = 0
count = 0
for i in time:
  if i[0] >= end:
    end = i[1]
    count += 1
print(count)