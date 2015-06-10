# Printing Multiplication Table

a=input("Enter a Number")
print("The Multiplication Table is ")
for i in range(1,21) :
	print("%d * %d = %d"%(a,i,a*i))