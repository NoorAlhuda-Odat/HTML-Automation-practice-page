package FormProjectt.FormProjectt;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class AppTest extends TestData{
	
	WebDriver driver = new ChromeDriver();
	String URL ="http://127.0.0.1:5500/maven.html";
	
	@BeforeTest
	public void MySetup(){
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void ScrollTest() throws InterruptedException{
	JavascriptExecutor Js= (JavascriptExecutor) driver;
	Js.executeScript("window.scrollTo(0,1800)");
	Thread.sleep(1000);
	Js.executeScript("window.scrollTo(1800,0)");
	}
	
	@Test(priority = 2)
	public void FillingInputFields() {

		WebElement TextInput = driver.findElement(By.id("text"));
		WebElement Email= driver.findElement(By.id("email"));
		WebElement Date = driver.findElement(By.id("date"));
		WebElement Password= driver.findElement(By.id("password"));
		WebElement Number= driver.findElement(By.id("number"));
		WebElement FileUploadButton = driver.findElement(By.id("file"));
		//WebElement Genders = driver.findElement(By.xpath("//input[@value='"+RandomGender+"']"));
		
		List<WebElement> Genders = driver.findElements(By.name("gender"));
		List<WebElement> Hoppies= driver.findElements(By.name("hobby"));
		
		TextInput.sendKeys(RandomText);
		Email.sendKeys(RandomEmail);
		Date.sendKeys(RandomDate);
		Password.sendKeys(RandomPassword);
		Number.sendKeys(RandomNumber);
		FileUploadButton.sendKeys(FilePath);
		//Gender.get(RandomGender).click();
		Genders.get(RandomGender2).click();
		for(int i = 0 ; i < Hoppies.size();i++) {
			Hoppies.get(i).click();
		}
		
	}
	
	 
}
   

