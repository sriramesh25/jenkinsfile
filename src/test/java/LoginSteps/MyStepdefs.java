package LoginSteps;

import DataProvider.ConfigFileReader;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyStepdefs {
    WebDriver driver;
    ConfigFileReader configFileReader;

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Exception {
        // Write code here that turns the phrase above into concrete actions
       // String path = getData("driverPath");
        //System.setProperty("webdriver.chrome.driver",path);
        System.setProperty("webdriver.chrome.driver","C:\\users\\sridevi\\desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //configFileReader = new ConfigFileReader();
     //configFileReader.readPropertyFile();
     //driver.navigate().to(configFileReader.readPropertyFile());

       driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");


    }


    @And("^I click Login Button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage page = new LoginPage(driver);
        page.ClickLogin();

    }

    @Then("^I should see Userform page$")
    public void iShouldSeeUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

            }

    @And("^Enter the following$")
    public void enterTheFollowing(DataTable table) throws Throwable {

        List<User> user = new ArrayList<User>();
        user = table.asList(User.class);
        LoginPage page = new LoginPage(driver);

        for(User users:user)
        {
            page.Login(users.username,users.password);
        }

    }

    public class User{
        public String username;
        public String password;

        public User(String Username,String Password) {
            username = username;
            password = password;

        }
    }
}
