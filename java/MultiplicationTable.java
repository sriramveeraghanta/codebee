import java.io.*;

 class MultiplicationTable
 {
  public static void main(String args[])throws IOException
  {
  	 int n,i;
  	 System.out.println("Enter the n value :");
  	 DataInputStream dis=new DataInputStream(System.in);
  	 n=Integer.parseInt(dis.readLine());
  	 System.out.println("The Multiplication Table is :");
  	 for(i=1;i<=20;i++)
  	 {	
  	  System.out.println(n+"*"+i+" = "+n*i);
  	 }
  }
 }