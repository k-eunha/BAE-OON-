# -*- coding: utf-8 -*-
"""2753

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1IwbB_aKa9VLxowFAk9b07cTlu86bIz6P
"""

num = int(input())
if num%4 == 0 and num%100 != 0:
  print("1")
elif num%400 == 0:
  print("1")
else:
  print("0")