import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//BY.id
	    driver.get("https://www.ehealthinsurance.com/");
	    driver.findElement(By.className("select-container")).click();
	    driver.findElement(By.xpath("//*[@id=\"desktop-banner-options\"]/a[4]")).click();
	    driver.findElement(By.id("find-btn")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div[2]/input")).click();
	   WebElement pin= driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div[2]/input"));
	    pin.sendKeys("48480");
	    
	    driver.manage().window().maximize();
	    //3rd sheet
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div[2]/button")).click();	 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[@role='button' ][2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"census\"]/div/div/div/div[2]/button")).click();
	    
	  //4th sheet
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@role='button'][2]")).click();
	    driver.findElement(By.xpath("//p[@role='button'][2]")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("12");
	    driver.findElement(By.xpath("//*[@id=\"census\"]/div/div/div[2]/div/div/div/input[2]")).sendKeys("12");
	    driver.findElement(By.xpath("//*[@id=\"census\"]/div/div/div[2]/div/div/div/input[3]")).sendKeys("1993");
	    Thread.sleep(10000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
		    Thread.sleep(1000); 
	   WebElement seeplan = driver.findElement(By.xpath("//button[@class='button-primary whitespace-no-wrap w-2-3']"));
	// WebElement seeplan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button-primary whitespace-no-wrap w-2-3']")));
      seeplan.click();
	
      Thread.sleep(10000); 
      
      js.executeScript("window.scrollBy(0,500)");
    
      //WebElement company =driver.findElement(By.xpath("//button[contains(text(),'UnitedHealthcare (16')]"));

//      Actions action = new Actions(driver);
//      action.moveToElement(company).perform();
//    
    
    
      Thread.sleep(1000); 
    //  js.executeScript("window.scrollBy(0,500)");
      
    
     
      
      for(int i=0;i<1;i++)
      {
     // WebElement company =driver.findElement(By.xpath("//button[contains(text(),'UnitedHealthcare (16')]"));
    	//*[@id="__layout"]/div/div[1]/section[2]/div/div/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/button[4]
    	  WebElement company =driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/section[2]/div/div/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/button[4]"));   
    	  company.click();
      
      }
      
      Thread.sleep(1000); 
      js.executeScript("window.scrollBy(0,2000)");
      
      for(int j=0;j<1;j++)
      {
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[4]/a/button"))).click();    
      }
      
	    //WebElement dd1= driver.findElement(By.text(Health Insurance));
//	  dd1.sendKeys(Keys.ARROW_DOWN);
//	  dd1.sendKeys(Keys.ENTER);
//	  driver.findElement(By.name("Health Insurance")).click();
	    
	    
	      
	}

}
