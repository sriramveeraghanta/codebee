/*Fibonacci of n numbers */
import java.io.*;

class fib
{
 int f1=0,f2=1,f3;
  void sequence()
  {
   f3=f1+f2;
   f1=f2;
   f2=f3;
  } 
} 
class fibonacci
{
 public static void main(String args[])throws IOException
 {
  int i,n;
  DataInputStream dis=new DataInputStream(System.in);
  System.out.println("Enter n Value :");
  n=Integer.parseInt(dis.readLine());
  fib f=new fib();
  System.out.println("Fibonacci sequence is :");
  System.out.println(f.f1);
  System.out.println(f.f2);
  for(i=2;i<n;i++)
   {
  	f.sequence();
  	System.out.println(f.f3);
   }
  }
 } 