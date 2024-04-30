package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinFinal{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\prabhu\\eclipse-workspace\\prabhu\\Java_Selenium1\\driver\\chromedriver2\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement login = driver.findElement(By.id("username"));
	login.click();
	login.sendKeys("prabhu123");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.click();
	pass.sendKeys("prabhu123");
	
	WebElement logclick = driver.findElement(By.id("login"));
	logclick.click();
	
	WebElement location = driver.findElement(By.id("location"));
	location.click();
    
	Select l = new Select(location);
	l.selectByVisibleText("New York");
	
	WebElement hotel = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
	hotel.click();
	
	Select h = new Select(hotel);
	h.selectByVisibleText("Hotel Sunshine");
	
	WebElement room = driver.findElement(By.xpath("//select[@name=\"room_type\"]")); 
	room.click();
	
	Select r = new Select (room);
	r.selectByVisibleText("Super Deluxe");
	
	WebElement adult = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
	adult.click();
	
	Select a = new Select(adult);
	a.selectByVisibleText("3 - Three");
	
	WebElement submit = driver.findElement(By.xpath("//input[@name=\"Submit\"]"));
	submit.click();
	
	WebElement click = driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]"));
	click.click();
	
	WebElement cont = driver.findElement(By.xpath("//input[@name=\"continue\"]"));
	cont.click();
	
	WebElement name = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
	name.sendKeys("Prabhu");
	
	WebElement initial = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
	initial.sendKeys("G");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
	address.sendKeys("No.12,chokeberry street,texas, USA ");
	
	WebElement cc = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
	cc.sendKeys("1211109876543210");
	
	WebElement cctype = driver.findElement(By.xpath("//select[@name=\"cc_type\"]"));
	cctype.click();
	Select c = new Select(cctype);
	c.selectByVisibleText("VISA");
	
	WebElement expmon = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
	expmon.click();
	Select m = new Select(expmon);
	m.selectByVisibleText("June");
	
	WebElement expyr = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
	expyr.click();
	Select y = new Select(expyr);
	y.selectByVisibleText("2025");
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
	cvv.sendKeys("369");
	
	WebElement book = driver.findElement(By.xpath("//input[@type=\"button\"][1]"));
	book.click();
	
}
}
