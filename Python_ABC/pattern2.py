n=int (input())

for i in range(n):
    for  j in range(n):
        if( i==j      or  i==0      or i==n-1 or 
           j==0       or  j==n-1    or 
           j==n//2    or  i==n//2   or i+j==n-1 or
           i+j==n//2  or  i-j==n//2 or j-i==n//2 or 
           j+i==(n+n//2)-1 ):
            print("*", end='')
        else:
            print(" ",end='')
    print()