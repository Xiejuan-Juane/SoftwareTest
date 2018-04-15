package cn.tju.jane;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;

public class Testlab {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private GetCheckInfo getinfo = new GetCheckInfo();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test

	public void testLab() throws Exception {
		String username, url;

		List<Map<String, String>> list = getinfo.getExcelValue();

		for (Map<String, String> map : list) {
			for (Entry<String, String> entry : map.entrySet()) {
				username = entry.getKey();
				url = entry.getValue();
				if (username.isEmpty()) {
					System.out.println("The username is null");

				} else if (url.isEmpty()) {
					System.out.println("The url is null");

				} else {
					username = username.trim();
					url = url.trim();
					driver.get("https://psych.liebes.top/st");
					driver.findElement(By.id("username")).click();
					driver.findElement(By.id("username")).clear();
					driver.findElement(By.id("username")).sendKeys(username);
					driver.findElement(By.id("password")).click();
					driver.findElement(By.id("password")).clear();
					driver.findElement(By.id("password")).sendKeys(username.substring(username.length() - 6));
					driver.findElement(By.id("submitButton")).click();
					assertEquals(url, driver.findElement(By.xpath("//p")).getText());

				}
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
