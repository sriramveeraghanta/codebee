import java.io.*;
class BasicMath
{
	public static void main(String args[])throws IOException
	{
		int a,b,c;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the a value");
		a=Integer.parseInt(dis.readLine());
		System.out.println("Enter the b value");
		b=Integer.parseInt(dis.readLine());
		c=a+b;
		System.out.println("The Addition of two values is "+c);
		c=a-b;
		System.out.println("The Subtraction of two values is "+c);
		c=a*b;
		System.out.println("The Multiplication of two values is "+c);
		c=a/b;
		System.out.println("The Division of two values is "+c);
		c=a%b;
		System.out.println("The Moduless of two values is "+c);
	}
}