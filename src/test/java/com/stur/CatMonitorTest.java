package com.stur;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by djshi on 2016/1/12.
 */
public class CatMonitorTest extends TestCase{
	public void testDemo(){
		System.setProperty("webdriver.chrome.driver", "E:\\research\\selenium\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new ChromeDriver(capabilities);

		driver.get("http://cat.ctripcorp.com/cat/r");

		WebDriverWait waiter = new WebDriverWait(driver, 60*1000);
		waiter.until(ExpectedConditions.presenceOfElementLocated(By.className("report")));
		WebElement eleItem=driver.findElements(By.cssSelector(".report > div > h3")).get(0);
		System.out.println("[CAT错误大盘显示]"+eleItem.getText());

		//driver.close();
	}
}
