package step_definitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Page_Factory.WishListPF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListVerify {
	
	WebDriver driver;
	
	
	WishListPF wishlist=PageFactory.initElements(driver, WishListPF.class);
	
	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		
		
		String parentHandler=driver.getWindowHandle();
		System.out.println("window:"+parentHandler);
		//To open new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//To open a new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//Again go to the parent tab
		
		driver.switchTo().window(parentHandler);
		
		
		

		String expectedTitle="Ninja";
		String actualTitle=driver.getTitle();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatched");
		
	}
	
	
	

	@When("user select the item to added into the wishlist")
	public void user_select_the_item_to_added_into_the_wishlist() {
		wishlist.item(); 
		
	
	}

	@And("Click on whishlist botton present in the product")
	public void click_on_whishlist_botton_present_in_the_product() {
	    wishlist.wish();
	}

	@Then("click on wishlist button on the top frame")
	public void click_on_wishlist_button_on_the_top_frame() {
	   wishlist.wishlists();
	}

   @Given("User should click the new customer registered account")
	public void user_should_click_the_new_customer_registered_account() {
	    wishlist.NewReg();
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,550)");
	}

	@When("user enters first name and last name and Email and Telephone and Password and Confirm Password")
	public void user_enters_first_name_and_last_name_and_email_and_telephone_and_password_and_confirm_password() throws AWTException {
	    wishlist.firstname();
	    
	    Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
	    
		wishlist.lastname();
	    act.sendKeys(Keys.TAB).build().perform();
	    
		wishlist.email();
		act.sendKeys(Keys.TAB).build().perform();
	    
		wishlist.telephone();
		act.sendKeys(Keys.TAB).build().perform();
	    
		wishlist.password();
		
		Robot robot=new Robot();
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		
		act.sendKeys(Keys.TAB).build().perform();
				

	    
		wishlist.confirmpass();
		act.sendKeys(Keys.TAB).build().perform();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	
		
		robot.keyPress(KeyEvent.VK_TAB);

	}

	@And("user select the privacy policy")
	public void user_select_the_privacy_policy() {
	    wishlist.privacy();
	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() {
	    wishlist.submit();  
	}

	@Given("User enter registered Email and password")
	public void user_enter_registered_email_and_password() {
	    wishlist.email1();
	    wishlist.password1();
	}

	@And("click on login button")
	public void click_on_login_button() {
	    wishlist.login();
	}

	@Then("user should navigate WishList page")
	public void user_should_navigate_wish_list_page() throws IOException {
	    driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).isDisplayed();
	    
	    ScreenShot.ScreenShotCapture(driver, "imagecaptured");
	}

	@Given("User click on add to cart button in the item to add")
	public void user_click_on_add_to_cart_button_in_the_item_to_add() {
	    wishlist.addtocart();
	}

	@Then("Click to continue")
	public void click_to_contine() {
	    wishlist.continues();
	}



	@Given("USer click on remove button in the item to remove")
	public void u_ser_click_on_remove_button_in_the_item_to_remove() {
	    wishlist.remove();
	}

	@Then("click to continue")
	public void click_to_continue() {
	    wishlist.continuess();
	driver.close();
	}

}
