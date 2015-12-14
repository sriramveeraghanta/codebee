// Roots of Quadratic Equation
#include<stdio.h>
#include<math.h>
int main()
{
  double a,b,c,det,root1,root2,real,img;
  printf("Enter the Coefficients a,b,c \n");
  scanf("%lf %lf %lf",&a,&b,&c);
  det=((b*b)-(4*a*c));
  if(det>0)
  {
    root1=(-b+sqrt(det)/(2*a));
    root2=(-b-sqrt(det)/(2*a));
    printf("Roots are: %.2lf and %.2lf \n",root1,root2);
  }
  else if(det==0)
  {
    root1=root2=-b/(2*a);
    printf("Roots are: %.2lf and %.2lf \n",root1,root2);
  }
  else
  {
    real= -b/(2*a);
    img = sqrt(-det)/(2*a);
    printf("Roots are: %.2f+%.2fi and %.2f-%.2fi \n",real,img,real,img);
  }
}