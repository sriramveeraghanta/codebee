import java.io.*;
class Area
{
	public static void main(String args[])throws IOException
	{
		int side,area;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the side");
		side=Integer.parseInt(dis.readLine());
		area=side*side;
		System.out.println("The area of the square is "+area);

		int length,breadth;
		System.out.println("Enter the length of the rectangle");
		length=Integer.parseInt(dis.readLine());
		System.out.println("Enter the breadth of the rectangle");
		breadth=Integer.parseInt(dis.readLine());
		area=length*breadth;
		System.out.println("The area of the rectangle is "+area);
	}
}