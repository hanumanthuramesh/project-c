package autoITframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fileuploadsendkeys {

	public static void main(String[] args) {
		// step1:To open and  set up google chrome driver
				System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
				//step2:Object creation for chrome driver and local variable declaration
				//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//step3: To maximize the window 
				driver.manage().window().maximize();
				//step4:Get the URL
				driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
				// step5:upload resume through send keys
				driver.findElement(By.className("main-3")) .click();
				//driver.findElement(By.xpath("//button[@class=\"uploadResume resman-btn-primary resman-btn-small\"]")).click();
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
					
				// ("C:\\Users\\USER\\Downloads\\My Resumes\\Hanumanthu_ Ramesh.pdf\\");

		
		

	}

}
