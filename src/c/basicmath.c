#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter the a value \n");
	scanf("%d",&a);
	printf("Enter the b value \n");
	scanf("%d",&b);
	c=a+b;
	printf("The Addition of two numbers is %d \n",c);
	c=a-b;
	printf("The Subtraction of two numbers is %d \n",c );
	c=a*b;
	printf("The Multiplication of two numbers is %d\n",c);
	c=a/b;
	printf("The Division of two numbers is %d \n",c);
	c=a%b;
	printf("The Muduless of two number is %d \n",c);
}