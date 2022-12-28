package week1.day1;

public class Calculator {

	public void add2numbers()
	{
		int x= 2;
		int y= 3;
		int z= 5;
		System.out.println(x+y);
	}
	public int add3numbers(int x,int y,int z)
	{
		return x+y+z;
	}
	public void multiply2numbers()
	{
		int x= 4;
		double y= 2.4d;
		System.out.println(x*y);
	}
	public int multiply2numbers(int x,int y)
	{
		return x*y;
	
	}
	public void subtract2numbers()
	{
	double x=15.23d;
	double y=10.10d;
	System.out.println(x-y);
	}
	public int subtract2numbers(int x,int y)
	{
		return x-y;
	}
	public void divide2numbers()
	{
	int x=4;
	double y=2.4d;
	System.out.println(x/y);
	}
	public int divide2numbers(int x,int y)
	{
		return x/y;
	}
	
	public static void main(String[] args) 
	{
	Calculator obj= new Calculator();
	obj.add2numbers();
	obj.subtract2numbers();
	obj.divide2numbers();
	obj.multiply2numbers();

	}

}
