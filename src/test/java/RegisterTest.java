import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

    public void register(){


        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Cucuu");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Bau");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("cucuubau@ups.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345678");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));//nu am dat click deoarece dupa nu mai poti rula testul

 //       driver.quit();





    }

    public void existingUser (){
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Peter");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Vlad");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();


        //        driver.quit();
    }




    public void changeLanguage(){
        WebDriver driver = new ChromeDriver();


        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();

        Select mydrpdwn = new Select(driver.findElement(By.id("select-language")));
        mydrpdwn.selectByVisibleText("French");


//        driver.quit();

    }
}
