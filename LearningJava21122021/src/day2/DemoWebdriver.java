package day2;

public class DemoWebdriver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
	//only chromeDriver will have access to method defined in the ChromeDriver not driver class. i.e ChromeSettings.
		chromeDriver.ChromeSettings();
		
	}
}
