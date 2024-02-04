package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Cname");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fname");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lname");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Fname Loc");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Depname");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Descname");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@testmail.com");
		//To select a value in drop-down button
		WebElement source=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop=new Select(source);
		drop.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("");
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Important field udpated");
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	}

}
