import java.io.*;
class evenodd
{
 public static void main(String args[]) throws IOException
 {
  int a;
  System.out.println("Enter a Number:");
  DataInputStream dis=new DataInputStream(System.in);
  a=Integer.parseInt(dis.readLine());
  if(a%2==0)
  {
    System.out.println("The Number "+a+" is even number");
  }
  else
  {
    System.out.println("The Number "+a+" is odd number");
  } 
 }
}
