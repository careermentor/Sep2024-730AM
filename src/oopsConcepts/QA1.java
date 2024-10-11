package oopsConcepts;

public class QA1
{
	int x = 500;
	
	
	public  void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum: " + d);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum: " + c);
	}
	
	public static void main(String[] args) {
		
		QA1 q1 = new QA1();
		
		q1.sum(30, 40);
		q1.sum(20, 30, 40);
		
		DemoStaticKeyword.meth2();
		
	}
}
