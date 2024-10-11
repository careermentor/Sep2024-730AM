package oopsConcepts;

public class CallDemoInterface implements DemoInterface
{

	
	public void m3() {
	
		System.out.println("this is method 3");
	}

	
	public void m4() {
		System.out.println("this is method 4");
		
	}

	public static void main(String[] args) {
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.m3();
		cdi.m4();
	}
	
}
