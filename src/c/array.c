// Array Implementation
#include<stdio.h>
int main()
{
	int a[10],i,n;
	printf("Enter the Number of Elements\n");
	scanf("%d",&n);
	printf("Enter the Array Elements\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("The Array Elements are \n");
	for(i=0;i<n;i++)
	{
		printf("%d \t \n",a[i]);
	}
}