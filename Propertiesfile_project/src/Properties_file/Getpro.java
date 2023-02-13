package Properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Getpro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D://class12//Config.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties pos = new Properties();
		
		pos.load(fis);
		
		String result = pos.getProperty("IPADDRESS");
		System.out.println(result);
		System.out.println("check result");
		System.out.println("result is checked");

	}

}
