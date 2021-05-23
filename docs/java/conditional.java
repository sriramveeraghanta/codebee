// conditional statments
import java.io.*;
class conditional
{
	public static void main(String[] args)throws IOException
	{
		int a;
		DataInputStream dis= new DataInputStream(System.in);
		System.out.println("Enter the a value");
		a=Integer.parseInt(dis.readLine());
		if(a==1)
		{
			System.out.println("The value of a is 1");
		}
		else if(a==2)
		{
			System.out.println("The value of a is 2");
		}
		else
		{
			System.out.println("The value of a is neither 1 nor 2");
		}
	}
}