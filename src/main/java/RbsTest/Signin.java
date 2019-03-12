package RbsTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Signin extends BaseClass {



    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    WebDriver driver = getChromeDriver();

    @Given("^User navigate into autopractise website")
    public void user_navigate_into_autopractise_website() {

        driver.get("http://automationpractice.com/index.php");

    }


    @Then("^User entered the user name and password  into autopractise website$")
    public void user_entered_the_user_name_and_password_into_autopractise_website() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        System.out.println("User has logged in ");

    }

    @Then("^I enter a \"([^\"]*)\"$")
    public void i_enter_a(String arg1) throws Throwable {
    WebElement email  =   driver.findElement(By.id("email"));
    email.sendKeys(arg1);
    }

    @Then("^I enter \"([^\"]*)\"$")
    public void i_enter(String arg2) throws Throwable {
        WebElement password  =   driver.findElement(By.id("passwd"));
        password.sendKeys(arg2);
    }

    @Then("^click on sign in button$")
    public void click_on_sign_in_button() throws Throwable {
        WebElement submitlogin   =   driver.findElement(By.id("SubmitLogin"));
        submitlogin.click();

    }


}