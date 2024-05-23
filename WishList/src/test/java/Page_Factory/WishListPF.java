package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPF {
	
	WebDriver driver;
	
	
	public WishListPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, WishListPF.class);
	}
	
	@CacheLookup
	@FindBy(xpath="//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
	WebElement item;
	@FindBy(xpath="//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[2]/i[1]")
	WebElement wish;
	@FindBy(xpath="//span[contains(text(),'Wish List (2)')]")
	WebElement wishlists;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement NewReg;
	@FindBy(id="input-firstname")
	WebElement firstname;
	@FindBy(id="input-lastname")
	WebElement lastname;
	@FindBy(id="input-email")   
	WebElement email;
	@FindBy(id="input-telephone")
	WebElement telephone;
	@FindBy(id="input-password")
	WebElement password;
	@FindBy(id="input-confirm")
	WebElement confirmpass;
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement privacy;
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	WebElement submit;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email1;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password1;
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement login;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
	WebElement addtocart;
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement continuebuttn;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[1]")
	WebElement remove;
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement continuebtn;
	

	public void item() {
		// TODO Auto-generated method stub
		item.click();
	}


	public void wish() {
		// TODO Auto-generated method stub
		wish.click();
	}


	public void wishlists() {
		// TODO Auto-generated method stub
		wishlists.click();
	}


   public void NewReg() {
		// TODO Auto-generated method stub
		NewReg.click();
	}


	public void firstname() {
		// TODO Auto-generated method stub
		firstname.click();
	}


	public void lastname() {
		// TODO Auto-generated method stub
		lastname.click();
	}


	public void email() {
		// TODO Auto-generated method stub
		email.click();
	}

	public void telephone() {
		// TODO Auto-generated method stub
		telephone.click();
	}


	public void password() {
		// TODO Auto-generated method stub
		password.click();
	}


	public void confirmpass() {
		// TODO Auto-generated method stub
		confirmpass.click();
	}


	public void privacy() {
		// TODO Auto-generated method stub
		privacy.click();
	}


	public void submit() {
		// TODO Auto-generated method stub
		submit.click();
	}


	public void email1() {
		// TODO Auto-generated method stub
		email1.click();
	}


	public void password1() {
		// TODO Auto-generated method stub
		password1.click();
	}


	public void login() {
		// TODO Auto-generated method stub
		login.click();
	}


	public void addtocart() {
		// TODO Auto-generated method stub
		addtocart.click();
	}


	public void continues() {
		// TODO Auto-generated method stub
		continuebuttn.click();
	}


	public void remove() {
		// TODO Auto-generated method stub
		remove.click();
	}


	public void continuess() {
		// TODO Auto-generated method stub
		continuebtn.click();
	}
	
	


}
