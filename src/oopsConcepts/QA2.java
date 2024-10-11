package oopsConcepts;

public class QA2 extends QA1
{
	
	int x = 100;
	
	public void printVal()
	{
		final int x = 200;
		//x=300;
		
		System.out.println(x); //200
		
		System.out.println(this.x);
		
		System.out.println(super.x);
		
		super.sum(30, 40);
		
	}
	
	
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum: " + c);
	}
	
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction: " + c);
	}
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		q2.sub(30, 40);
		q2.sum(30, 40);
		q2.qa1im();
		q2.printVal();
	}



	
	public void qa1im() {
		System.out.println("this method is from QA1I");
		
	}
}
