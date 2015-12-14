#Factorail of a Number
n=input("Enter n Value")
fact=1
if n==0 :
	print("The Factorail of %d is 1"%(n))
else :
	for i in range(1,n+1) :
		fact=fact*i
	print("The Factorail of %d is %d "%(n,fact))
