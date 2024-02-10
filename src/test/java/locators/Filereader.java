package locators;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\Naarsoft\\src\\test\\java\\locators\\locators");
		Properties p = new Properties();
		p.load(fr);

	}

}
