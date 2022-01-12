package day2;

public class ChromeDriver implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("navigate to url"+ url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Simpli Learn");
		return null;
	}

	@Override
	public void refresh() {
		System.out.println("Refresh page");
	}

	public void ChromeSettings() { 
		System.out.println("Define Chrome Browser settings...");
	}
	
	
}
