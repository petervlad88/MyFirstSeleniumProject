import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Login {

    private WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

    }

    @Test
    public void login() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        WebElement dashBoard = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.page-title > h1"));
        Assert.assertTrue(dashBoard.isDisplayed());
        Assert.assertNotEquals("Hello, ghita cucu!", dashBoard.getText());

        WebElement hello = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertEquals("Hello, ghita cucu!", hello.getText());

    }

    @Test
    public void forgetPasswordEmptyField() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#login-form > div > div.col-2.registered-users > div.content.fieldset > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("#email_address")).sendKeys("");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();

        WebElement requiredField = driver.findElement(By.cssSelector("#advice-required-entry-email_address"));
        Assert.assertNotEquals("This is a required field", requiredField.getText());
        Assert.assertEquals("This is a required field.", requiredField.getText());


    }

    @Test
    public void emptyFields(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("");
        driver.findElement(By.cssSelector("#pass")).sendKeys("");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();

        WebElement requiredField = driver.findElement(By.cssSelector("#advice-required-entry-email"));
        Assert.assertTrue(requiredField.isDisplayed());


    }

    @After

    public void close(){

        driver.close();
    }


}

