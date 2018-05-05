package SeleniumWebDriver;


public class IndeedSearch {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\manchego\\OneDrive - Hewlett Packard Enterprise\\LEARN & WORK\\SELENIUM\\Selenium Software\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new InternetExplorerDriver();
			//WebDriver driver = new FirefoxDriver();
		    driver.get("https://www.indeed.co.in");
			driver.findElement(By.id("what")).sendKeys("Selenium");
			driver.findElement(By.id("where")).clear();
			driver.findElement(By.id("where")).sendKeys("Bangalore");
			driver.findElement(By.id("fj")).click();
			driver.findElements(By.id("alertmail"));
			System.out.println(driver.getTitle());
			System.out.println(	driver.findElement(By.id("searchCount")).getText());
			System.out.println(new date());
			
	}

}
