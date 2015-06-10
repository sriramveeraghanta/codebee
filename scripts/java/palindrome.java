import java.io.*;
class palindrom
{
	 public static void main(String[] args)throws IOException
	 {
	 	String org,rev="";
	 	System.out.println("Enter a string");
	 	DataInputStream dis=new DataInputStream(System.in);
	 	org=dis.readLine();
	 	int length=org.length();
	 	for(int i=length-1;i>=0;i--)
	 	{
	 		 rev=rev+org.charAt(i);
	 	}
	 	System.out.println(rev);
	 	if(org.equals(rev))
	 	{
	 		System.out.println("The String Entered is a palindrom");
	 	}
	 	else
	 	{
	 		System.out.println("The String Entered is not a palindrom");
	 	}
	 }
}