// Swapping of two numbers
import java.io.*;
class swap
{
	public static void main(String args[])throws IOException
	{
		int a,b,temp;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the values of a and b");
		a=Integer.parseInt(dis.readLine());
		b=Integer.parseInt(dis.readLine());
		System.out.println("The values before swapping is a= "+a+" and b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("The values after swapping is a= "+a+" and b= "+b);
	}
}