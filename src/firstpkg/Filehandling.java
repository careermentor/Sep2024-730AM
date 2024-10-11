package firstpkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Filehandling 
{
	public static void readprop() throws Exception
	{
		//File f = new File("./TestData/config.properties");
		
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("Selenium"));
		
		
		System.out.println(prop.get("Name"));
	
	}
	
	public static void wrietdata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
	
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
		
	}
	
	

	public static void readdata() throws Exception
	{
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //116
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		readprop();
	}
	
}
