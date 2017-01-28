/*factorial of a number */
import java.io.*;

class factorial
{
 public static void main(String args[]) throws IOException
 {
  long n,i,fact=1;
  System.out.println(" Enter the n value ");
  DataInputStream dis=new DataInputStream(System.in);
  n=Long.parseLong(dis.readLine());
  if(n==0)
  {
   System.out.println("The Factorial of "+n+" is 1");
  }
  else
  {
    for(i=1;i<=n;i++)
	  { 
	   fact=fact*i;
	  }
    System.out.println("The Factorial of "+n+" is "+fact);	
  }  
 }
}
