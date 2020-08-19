package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class formSteps {

    WebDriver driver;
    WebDriverWait wait;
    @Given("^navigate to website$")
    public void navigate_to_website() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
     //   WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
       wait= new WebDriverWait(driver,10);
    }

    @Given("^fill in the blanks$")
    public void fill_in_the_blanks() throws Throwable {

        driver.findElement(By.id("firstName")).sendKeys("Ömer");
        driver.findElement(By.id("lastName")).sendKeys("Özdemir");
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("omer@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0123324234");
      driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
      driver.findElement(By.id("currentAddress")).sendKeys("Germany");
//      WebElement city = driver.findElement(By.xpath("//div[text()='Select State']"));
//      city.click();
//        driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();
//
//        driver.findElement(By.xpath("//div[text()='Select City']")).click();

    }

    @When("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^click on close button$")
    public void click_on_close_button() throws Throwable {

        WebElement closeButton = driver.findElement(By.id("closeLargeModal"));

        System.out.println(closeButton.isDisplayed());


    }




    }

