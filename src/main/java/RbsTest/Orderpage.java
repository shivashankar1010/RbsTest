package RbsTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Orderpage {

    public static WebDriver driver;

    @Given("^User logged into autopractise website$")
    public void user_logged_into_autopractise_website() {
        System.setProperty("webdriver.chrome.driver", "/Users/shivahosur/develop/workspace/RbsTest/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");


    }


    @Then("^user click on the Tshirt link$")
    public void user_click_on_the_Tshirt_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();

    }

    @Then("^click on the add to cart$")
    public void click_on_the_add_to_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();

    }

    @Then("^click on the proceed to checkout$")
    public void click_on_the_proceed_to_checkout() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

    }

    @Then("^click on the check box for the Terms of service$")
    public void click_on_the_check_box_for_the_Terms_of_service() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^click on the proceed to checkout again$")
    public void click_on_the_proceed_to_checkout_again() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

        @Then("^click on the pay by bank wire$")
        public void click_on_the_pay_by_bank_wire () throws Throwable {
            // Write code here that turns the phrase above into concrete actions

        }

        @Then("^click on the I confirm the order$")
        public void click_on_the_I_confirm_the_order () throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        }

            @Then("^click on the view my customer account information$")
            public void click_on_the_view_my_customer_account_information () throws Throwable {
                // Write code here that turns the phrase above into concrete actions

            }

            @Then("^click on the order histroy and details$")
            public void click_on_the_order_histroy_and_details () throws Throwable {
                // Write code here that turns the phrase above into concrete actions

            }

       @Then("^verify the <\"([^\"]*)\"> is dispalyed to the user$")
    public void verify_the_is_dispalyed_to_the_user(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}



