# -*- coding: utf-8 -*-
"""11047

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1zTTMadHritR7RElJ7bccdjA3ekkcGD88
"""

num, money = map(int, input().split())
coin = []
count = 0
for i in range(num):
  coin.append(int(input()))
coin.sort(reverse=True)
for i in coin:
  div = int(money / i)
  count += div
  money -= i*div
print(count)