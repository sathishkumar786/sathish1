package path.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paths {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Day5\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		String txt1=driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[1]/div/h4[1]/b")).getText();
		String txt2=driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[2]/div/h4[1]/b")).getText();
		String txt3=driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[4]/div/h4[1]/b")).getText();
		System.out.println(txt1);
		System.out.println(txt2);
		System.out.println(txt3);
		
	}

}
