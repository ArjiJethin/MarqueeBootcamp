sibling1 = input()
sibling2 = input()

age1 = (int)(input())
age2 = (int)(input())

if(age1>age2):
    print(sibling1, "is older than", sibling2)
elif(age2>age1):
    print(sibling2, "is older than", sibling1)
else:
    print(sibling1, "and", sibling2, "are of the same age")