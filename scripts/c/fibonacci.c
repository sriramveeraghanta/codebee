/* Title : Program to print n terms in a fibnocci series */

#include<stdio.h>
int main()
{
 int num,count=3,a=0,b=1,c;
 printf("\n Enter the number");
 scanf("%d",&num);
 printf("\n Fibnocci series is \n");
 printf("%d %d",a,b);
 do
 {
  c=a+b;
  printf(" %d ",c);
  a=b;
  b=c;
  count++;
 }
 while(count<=num);
}
