sibling1 = input()
sibling2 = input()
sibling3 = input()

age1 = int(input())
age2 = int(input())
age3 = int(input())

if(age1 > age2) and (age1 > age3):
    if(age2 > age3):
        print(sibling1,"is the oldest,", sibling2,"is the middle,", sibling3,"is the youngest")
    else:
        print(sibling1,"is the oldest,", sibling3,"is the middle,", sibling2,"is the youngest")
elif(age2 > age1) and (age2 > age3):
    if(age1 > age3):
        print(sibling2,"is the oldest,", sibling1,"is the middle,", sibling3,"is the youngest")
    else:
        print(sibling2,"is the oldest,", sibling3,"is the middle,", sibling1,"is the youngest")
else:
    if(age3 > age1) and (age3 > age2):
        print(sibling3,"is the oldest,", sibling1,"is the middle,", sibling2,"is the youngest")
    else:
        print(sibling3,"is the oldest,", sibling2,"is the middle,", sibling1,"is the youngest")