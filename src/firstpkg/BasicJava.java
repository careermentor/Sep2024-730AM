package firstpkg;

 public class BasicJava 
{
	int a = 30;  // global variable
	
	
	 public void readdata()
	{

		 final int a = 10;  //local variable  //10
		// a=40;
			float b = 10.5f;
			char c = 'X';
			String d = "Java";
			boolean e = true;
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	 
	 public void m2()
	 {
		 System.out.println(a);  //30
	 }
	
	public static void main(String[] args) 
	{
		BasicJava abc = new BasicJava();
		abc.readdata();
		abc.m2();
		
		Calculations cal = new Calculations(30,40);
		cal.addition();
		
	}
	
	
	
	
	
}
