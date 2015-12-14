/* Perimeter of the rectangle*/
import java.io.*;
class perimeter
{
	public static void main(String args[])throws IOException
	{
		int length,breadth,perimeter;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the length of the rectangle");
		length=Integer.parseInt(dis.readLine());
		System.out.println("Enter the breadth of the rectangle");
		breadth=Integer.parseInt(dis.readLine());
		perimeter=(2*length)+(2*breadth);
		System.out.println("The perimeter of the rectangle "+perimeter);
	}
}