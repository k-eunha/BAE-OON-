# -*- coding: utf-8 -*-
"""2525

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1DKgpSC_pLJHTztB1a8GMfHh6jWYg2yQk
"""

h,m = map(int,input().split())
plus = int(input())

if m+plus < 60:
  m += plus
elif m+plus == 60:
  if h < 23:
    h+=1
  else:
    h=0
  m = 0
else:
  a = ((m+plus)//60)
    if h + a <= 23:
        h = h + a
    elif h + a >= 24:
        h = h + a - 24
    m = m+plus-(a*60)
    if m == 60:
        m = 0

print(h,m)

h,m=map(int,input().split())
t=h*60+m+int(input())
print(t//60%24,t%60)