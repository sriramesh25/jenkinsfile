package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name ="UserName")
    public WebElement txtUsername;

  @FindBy(name = "Password")
    public WebElement txtPassword;

  @FindBy(name = "Login")
    public WebElement btnLogin;

  public  void Login(String username,String password)
  {
      txtUsername.sendKeys(username);
      txtPassword.sendKeys(password);
  }

  public void ClickLogin()
  {
      btnLogin.submit();
  }
}
