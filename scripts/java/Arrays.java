// Array Implementation
import java.io.*;
class Arrays
{
	public static void main(String args[])
	{
		int a[],i,n;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the size of the Array");
		n=Integer.parseInt(dis.readLine());
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)		{
			a[i]=Integer.parseInt(dis.readLine());
		}
		System.out.println("The Elements in Array are");
		for (i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
}