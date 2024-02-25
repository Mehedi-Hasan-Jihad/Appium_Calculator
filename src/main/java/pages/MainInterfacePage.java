package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class MainInterfacePage {
	
	private AppiumDriver driver;
	private WebElement displayBox;
	private WebElement One;
	private WebElement two;
	private WebElement three;
	private WebElement four;
	private WebElement five;
	private WebElement six;
	private WebElement seven;
	private WebElement eight;
	private WebElement nine;
	private WebElement zero;
	private WebElement plus;
	private WebElement minus;
	private WebElement dividedBy;
	private WebElement multiplyBy;
	private WebElement delete;
	private WebElement dot;
	private WebElement equalTo;
	private WebElement result;
	private WebElement clr;
	private WebDriverWait wait;

	
	
    public MainInterfacePage(AppiumDriver driver) {
        this.driver = driver;
        initializeElements();
        
    }
	

	 
	    private void initializeElements() {
	    	One = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
	    	two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
	    	three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
	    	four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
	    	five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
	    	six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
	    	seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
	    	eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
	    	nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
	    	zero = driver.findElement(By.id("com.android.calculator2:id/digit_0"));
	    	plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
	    	minus = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
	    	dividedBy = driver.findElement(By.id("com.android.calculator2:id/op_div"));
	    	multiplyBy = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
	    	delete = driver.findElement(By.id("com.android.calculator2:id/del"));
	    	dot = driver.findElement(By.id("com.android.calculator2:id/dec_point"));
	    	equalTo = driver.findElement(By.id("com.android.calculator2:id/eq"));
	    	displayBox = driver.findElement(By.id("com.android.calculator2:id/formula"));
	    	result = driver.findElement(By.id("com.android.calculator2:id/result"));
	    	wait = new WebDriverWait(driver, Duration.ofMillis(10000));

//	    	clr = driver.findElement(By.id("com.android.calculator2:id/clr"));
	    	
	    }
	
	public void Plus() {

		plus.click();
	}
	

	public String  ResultBox(){

		return result.getText();
	}
	public void Minus() {

		minus.click();
	}
	
	public void DividedBy() {

		dividedBy.click();
	}
	public void MultiplyBy() {

		multiplyBy.click();
	}
	public void Delete() {

		delete.click();
	}
	public void Dot() {

		dot.click();
	}
	public void EqualTo() {

		equalTo.click();
	}
	public String DisplayBox() {

		return displayBox.getText();
	}
	public void One() {

		One.click();
	}
	public void Two() {

		two.click();
	}
	public void Three() {

		three.click();
	}
	public void Four() {

		four.click();
	}
	public void Five() {

		five.click();
	}
	public void Six() {

		six.click();
	}
	public void Seven() {

		seven.click();
	}
	public void Eight() {

		eight.click();
	}
	public void Nine() {

		nine.click();
	}
	public void CLR() {
		
	    clr = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.calculator2:id/clr")));
		if(clr.isDisplayed()) {	
		clr.click();
		}
		else {}
		
	}
	
	public void allButton() {

		One.click();
		two.click();
		three.click();
		
		four.click();
		five.click();
		six.click();
		seven.click();
		eight.click();
		nine.click();
		zero.click();
		


	}

	
	
	
}
