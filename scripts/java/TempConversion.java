/* Temperature Conversion from Celsius to Fahrenheit */
class TempConversion
{
	public static void main(String args[])throws IOException
	{
		double celsius,fahrenheit;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the Temperature in Celsius");
	 	celsius=Integer.parseInt(dis.readLine());
	 	fahrenheit=((celsius*9)/5)+32;
	 	System.out.println("The Temperature in Fahrenheit is "+fahrenheit);
	}
}