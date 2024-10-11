package firstpkg;

public class Calculations 
{

	
	public Calculations()
	{
		System.out.println("this is a constructor");
		
		int a = 20;
		float b = 30;
		float c = a+b;
		
		System.out.println("Sum of a&b: " + c);
	}
	
	
	public float addition()
	{
		int a = 20;
		float b = 30;
		float c = a+b;
		
		System.out.println("Sum of a&b: " + c);
		
		return b;
		
		
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum of a&b: " + c);
		return c;
	}
	
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum of a&b: " + c);
		
	}
	
	//40,50,60 = 
	//int x = 40+50
	//x+60
	
	public void substraction()
	{
		int a = 20;
		int b = 30;
		int c = a-b;
		
		System.out.println("substraction of a&b: " + c);
	}
	
	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations(30, 40);
		
		Calculations cal1 = new Calculations();
		
		
		float x = cal1.addition();
		cal.substraction();
		
		
		//int x = cal.addition();
		
		//System.out.println(x);
		
		
	//	cal.sum(cal.sum(40, 50), x);
		
	}
}
