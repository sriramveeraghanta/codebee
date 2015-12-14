/*Perimeter of the rectangle*/

#include<stdio.h>
int main()
{
	int length,breadth,perimeter;
	printf("Enter the length of the rectangle \n");
	scanf("%d",&length);
	printf("Enter the breadth of the rectangle \n");
	scanf("%d",&breadth);
	perimeter=(2*length)+(2*breadth);
	printf("The area of the rectangle is %d \n",perimeter);
}