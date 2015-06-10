/*To find the Factorial of a Number*/
#include<stdio.h>
int factorial(int);

int main()
{
 int n,fact;
 printf("Enter a number: \n");
 scanf("%d",&n);
 fact=factorial(n);
 printf("Factorial of the number is %d \n",fact);
}

int factorial(int x)
{
 int f;
 if(x==0)
 f=1;
 else
 f=x*factorial(x-1);
 return(f);
}
