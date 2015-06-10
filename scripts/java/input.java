import java.io.*;
class input
{
 public static void main(String args[]) throws IOException
 {
  int a;
  System.out.println("Enter a value");
  DataInputStream dis=new DataInputStream(System.in);
  a=Integer.parseInt(dis.readLine());
  System.out.println("The Value of a is:"+a);
 }
}
