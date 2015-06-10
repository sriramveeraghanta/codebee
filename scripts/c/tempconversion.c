/* Temperature Conversion from Celsius to Fahrenheit */
#include<stdio.h>
void main()
{
	 double celsius,fahrenheit;
	 printf("Enter the Temperature in Celsius \n");
	 scanf("%lf",&celsius);
	 fahrenheit=((celsius*9)/5)+32;
	 printf("The Temperature in Fahrenheit is %lf \n",fahrenheit);
}