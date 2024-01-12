package selenum_practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naver.com");
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		financeBtn.click();
		
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		
		
		driver.switchTo().window((String) tabs.get(1));
						
//		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
//		searchInput.sendKeys("삼성전자");
//		searchInput.sendKeys(Keys.ENTER);
//		WebElement price = driver.findElement(By.cssSelector("#content > div.section_search > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
//		System.out.println(price.getText());
		
//		WebElement news = driver.findElement(By.cssSelector("#content > div.article > div.section > div.news_area._replaceNewsLink > div > ul > li:nth-child(1) > span > a"));
//		System.out.println(news.getText());
		List news = driver.findElements(By.cssSelector("#content > div.article > div.section > div.news_area._replaceNewsLink > div > ul >li"));
		
		for (Object header : news) {
			System.out.println(((WebElement) header).getText());
		}
				
	}
}
