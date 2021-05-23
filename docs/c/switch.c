/* To implement the switch condition*/

#include<stdio.h>
int main()
{
	int choice;
	printf("Enter the choice \n");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1 : printf("The selected choice is 1 \n");
				 break;
		case 2 : printf("The selected choice is 2 \n");
				 break;
		case 3 : printf("The selected choice is 3 \n");
				 break;
		default : printf("The choice is invalid \n");
	}
}