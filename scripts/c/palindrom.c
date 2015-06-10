#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
 char str[50],temp[50];
 printf("\n Enter a string");
 scanf("%s",str);
 strcpy(temp,str);
 strrev(str);
 if(strcmp(temp,str)==0)
 	printf("\n Given string %s is palindrom",temp);
 else
 	printf("\n Given string %s is not a palindrom",temp);

 }
