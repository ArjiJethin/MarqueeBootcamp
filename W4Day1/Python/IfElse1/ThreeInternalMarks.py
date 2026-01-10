import math

marks1 = (int)(input())
marks2 = (int)(input())
marks3 = (int)(input())

if(marks1<=marks2 and marks1<=marks3):
    avg = (marks2 + marks3)/2.0
    print(math.ceil(avg))

elif(marks2<=marks1 and marks2<=marks3):
    avg = (marks1 + marks3)/2.0
    print(math.ceil(avg))

else:
    avg = (marks1 + marks2)/2.0
    print(math.ceil(avg))