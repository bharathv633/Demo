package com.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {

		
		String product= "iphone";

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("Siri123@gmail.com");
		
		driver.findElement(By.id("userPassword")).sendKeys("Abcd@1234");
		driver.findElement(By.id("login")).click();
		System.out.println("One product added 1");
		
		List <WebElement> listcart=driver.findElements(By.cssSelector("div.mb-3"));
		System.out.println("One product added 2");
		
		for(int i=0;i<listcart.size();i++)
		{
			System.out.println("One product added 3");
			System.out.println("One product added 4");
			System.out.println("One product added 3");
			System.out.println("One product added 3");

			String listName=listcart.get(i).getText();
			if(product.contains(listName)) {
				System.out.println("One product added 5");
				System.out.println("One product added 6");
				System.out.println("One product added 7");
				System.out.println("One product added 5");

				//List<WebElement> list2 =driver.findElements(By.xpath("//button[text() ='ADD TO CART']"));
	            //   list2.get(i).click();
	               List<WebElement> cartbutton=	driver.findElements(By.xpath("//button[text() =' Add To Cart']"));
				cartbutton.get(i).click();
				if(product.contains(listName)) {
					System.out.println("One product added 5");
					System.out.println("One product added 6");
					System.out.println("One product added 7");

					//List<WebElement> list2 =driver.findElements(By.xpath("//button[text() ='ADD TO CART']"));
		            //   list2.get(i).click();
		               List<WebElement> cartbutton1=	driver.findElements(By.xpath("//button[text() =' Add To Cart']"));
					cartbutton.get(i).click();

				//.card-body button:last-of-type"
				System.out.println("One product added");

			}
			
			
		}
	}

}
