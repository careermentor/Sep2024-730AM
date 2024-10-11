package oopsConcepts;

public abstract  class AbsClassDemo 
{

	
	public void m1()
	{
		System.out.println("this method is called concrete method");

		final int a = 30;
		//a=40;
	}
	
	public abstract  void m2();
	
	/*
	
	public static void main(String[] args) {
		AbsClassDemo abc= new AbsClassDemo();
		abc.m1();
		abc.m2();
	}
	*/
}
