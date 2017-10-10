# Roots of Quadratic Equation
import math
print("Enter the Coefficients a,b,c")
a=input()
b=input()
c=input()
det=((b*b)-(4*a*c))
if det>0:
  root1=(-b+math.sqrt(det)/(2*a))
  root2=(-b-math.sqrt(det)/(2*a))
  print("Roots are: %.2lf and %.2lf "%(root1,root2))
elif det==0 :
  root1=root2=-b/(2*a)
  print("Roots are: %.2lf and %.2lf "%(root1,root2))
else:
  real= -b/(2*a)
  img = math.sqrt(-det)/(2*a)
  print("Roots are: %.2f+%.2fi and %.2f-%.2fi "%(real,img,real,img))