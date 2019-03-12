package RbsTest;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
public class PersonalPage  extends  BaseClass {


    @Then("^click on the my personal information$")
    public void click_on_the_my_personal_information() throws Throwable {
        driver.findElement(By.xpath("//span[text()='My personal information']")).click();
        System.out.println("User is inside the personal information ");

    }
        @Then("^click on the first name$")
        public void click_on_the_first_name () throws Throwable {

            WebElement updatedname  =   driver.findElement(By.id("firstname"));
            updatedname.clear();
            updatedname.sendKeys("testname");
        }

            @Then("^update the first name$")
            public void update_the_first_name () throws Throwable {
                // Write code here that turns the phrase above into concrete actions

            }

            @Then("^click on the Save button$")
            public void click_on_the_Save_button () throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                driver.findElement(By.name("submitIdentity")).click();


            }



    @Then("^enter the password$")
    public void enter_the_password() throws Throwable {
          driver.findElement(By.id("old_passwd")).sendKeys("Sashaooo");

    }



    @Then("^verify < Your personal information has been successfully updated\\.> dispalyed to the user$")
            public void verify_Your_personal_information_has_been_successfully_updated_dispalyed_to_the_user () throws
            Throwable {
          assert(driver.getPageSource().contains("Your personal information has been successfully updated."));

            }
        }



