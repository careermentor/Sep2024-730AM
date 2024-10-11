package oopsConcepts;

public class DemoStaticKeyword
{

	static int a = 20;
	
	public void meth1()
	{
		System.out.println("this method is non static method");
	}
	
	public static void meth2()
	{
		
		System.out.println(a);
		System.out.println("this method is static method");
	}
	
	
	public static void main(String[] args) {
		
		DemoStaticKeyword dsk = new DemoStaticKeyword();
		dsk.meth1();
		
		DemoStaticKeyword.meth2();
	}
	
}
