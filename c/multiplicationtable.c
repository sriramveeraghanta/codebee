#include<stdio.h>
int main()
{
 int a,i;
 printf("Enter the number for which u want Multiplication Table \n");
 scanf("%d",&a);
 for(i=1;i<=20;i++)
 {
  printf("\n %d * %d =%d",a,i,i*a);
 } 
}
