/* Area of a square and rectangle */
#include<stdio.h>
int main()
{
	int side,area;
	printf("Enter the side of a square \n");
	scanf("%d",&side);
	area=side*side;
	printf("The area of a square is %d \n",area);

	int length,breadth;
	printf("Enter the length of the rectangle\n");
	scanf("%d",&length);
	printf("Enter the breadth of the rectangle\n");
	scanf("%d",&breadth);
	area=length*breadth;
	printf("The area of a rectangle is %d\n",area);
}