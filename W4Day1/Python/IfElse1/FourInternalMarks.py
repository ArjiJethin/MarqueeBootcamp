marks1 = (int)(input())
marks2 = (int)(input())
marks3 = (int)(input())
marks4 = (int)(input())

if(marks1<=marks2 and marks1<=marks3 and marks1<=marks4):
    avg = (marks2 + marks3 + marks4)/3
    print((int)(avg))
elif(marks2<=marks1 and marks2<=marks3 and marks2<=marks4):
    avg = (marks1 + marks3 + marks4)/3
    print((int)(avg))
elif(marks3<=marks1 and marks3<=marks2 and marks3<=marks4):
    avg = (marks1 + marks2 + marks4)/3
    print((int)(avg))
else:
    avg = (marks1 + marks2 + marks3)/3
    print((int)(avg))