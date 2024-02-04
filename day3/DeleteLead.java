package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		String title3=driver.getTitle();
		System.out.println(title3);
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("88888");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//---- Capture the lead ID of the first resulting lead.
		WebElement source = driver.findElement(By.xpath("//a[text()='14982']"));
		
		String LeadId=source.getText();
		System.out.println(LeadId);
		source.click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(LeadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		WebElement source2 = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String message=source2.getText();
		
		if(message.contains("No records to display")) {
			System.out.println("Confirming successful deletion");
		}
		else
		{
			System.out.println("Not Deleted");
		}
		//System.out.println(text);
	}

}
