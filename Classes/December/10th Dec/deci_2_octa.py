deci = int(input())
octa = 0
pv   = 1
copy_deci = deci

while copy_deci !=0:    
    remainder = copy_deci % 8
    octa = remainder * pv + octa
    copy_deci = copy_deci // 8
    pv*=10
print( octa) 
