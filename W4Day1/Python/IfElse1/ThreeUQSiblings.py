sibling1 = input()
sibling2 = input()
sibling3 = input()

age1 = int(input())
age2 = int(input())
age3 = int(input())

if(age1 == age2):
    if(age3 > age1):
        print(sibling3,"is the oldest,", sibling1,"and", sibling2,"are the younger twins")
    elif(age3 < age1):
        print(sibling1,"and", sibling2,"are the oldest twins,", sibling3,"is the youngest")
elif(age1 == age3):
    if(age2 > age1):
        print(sibling2,"is the oldest,", sibling1,"and", sibling3,"are the younger twins")
    elif(age2 < age1):
        print(sibling1,"and", sibling3,"are the oldest twins,", sibling2,"is the youngest")
elif(age2 == age3):
    if(age1 > age2):
        print(sibling1,"is the oldest,", sibling2,"and", sibling3,"are the younger twins")
    elif(age1 < age2):
        print(sibling2,"and", sibling3,"are the oldest twins,", sibling1,"is the youngest")

if(age1 == age2) and (age2 == age3):
    print("All three siblings are triplets of the same age")

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