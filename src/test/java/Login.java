import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public void login(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();






        //driver.quit();
    }

    public void forgetPasswordEmptyField(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#login-form > div > div.col-2.registered-users > div.content.fieldset > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("#email_address")).sendKeys("");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();

        //driver.quit();

    }


}
