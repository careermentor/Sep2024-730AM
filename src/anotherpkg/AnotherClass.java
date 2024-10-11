package anotherpkg;

import firstpkg.BasicJava;
import firstpkg.Calculations;

class AnotherClass 
{

	public static void main(String[] args) 
	{
		
		BasicJava bj = new BasicJava();
		bj.readdata();

		
		Calculations xyz = new Calculations();
		xyz.addition();
		xyz.substraction();
		
	}

}
