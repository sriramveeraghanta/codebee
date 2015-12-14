#Printing n terms of a fibonacci series
n=input("Enter a number")
a=0
b=1
print("%d\n%d"%(a,b))
for i in range(2,n) :
	c=a+b
	print("%d"%(c))
	a=b
	b=c