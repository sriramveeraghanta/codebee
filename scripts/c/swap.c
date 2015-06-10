// Swapping of two numbers
#include<stdio.h>
int main()
{
	int a,b,temp;
	printf("Enter a and b values \n");
	scanf("%d %d",&a,&b);
	printf("The values before swapping is a= %d and b= %d \n",a,b);
	temp=a;
	a=b;
	b=temp;
	printf("The values after swapping is a= %d and b= %d \n",a,b);
}