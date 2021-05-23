import java.io.*;
class switching
{
	public static void main(String args[])throws IOException
	{
		int choice;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the choice");
		choice=Integer.parseInt(dis.readLine());
		switch(choice)
		{
			case 1 : System.out.println("The choice Entered is 1");
					 break;
			case 2 : System.out.println("The choice Entered is 2");
					 break;
			case 3 : System.out.println("The choice Entered is 3");
					 break;
			case 4 : System.out.println("The choice Entered is 4");
					 break;
			case 5 : System.out.println("The choice Entered is 5");
					 break;
			default : System.out.println("The choice is Invalid");
		}
	}
}