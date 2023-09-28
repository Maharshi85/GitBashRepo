package gitbashpractice;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteDataIntoProperties {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		p.setProperty("browser","chrome");
		p.setProperty("username","admin");
		p.setProperty("password","admin");
		
		FileOutputStream f=new FileOutputStream("./src/test/resources/Gitbash.properties");
		p.store(f,"PropertyFileData");
		
		FileInputStream f1=new FileInputStream("./src/test/resources/Gitbash.properties");
		p.load(f1);
		System.out.println(p.getProperty("browser"));
	}
}
