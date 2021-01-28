import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    public void wishList(){


        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();



        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

//        driver.quit();


    }
     public void addToWishProductSpecificCOlor(){
         WebDriver driver = new ChromeDriver();
         driver.get("http://testfasttrackit.info/selenium-test/");
         driver.manage().window().maximize();
         driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
         driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
         driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
         driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
         driver.findElement(By.cssSelector("#send2 > span > span")).click();



         driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();
         driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > a")).click();
         driver.findElement(By.cssSelector("#swatch20 > span.swatch-label > img")).click();
         driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

         //Ajunge in wishlist dar nu cu culoarea schimbata deci e bug:))

//        driver.quit();

    }

    public void addToCartFromWishL(){
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("#item_859 > td.wishlist-cell4.customer-wishlist-item-cart > div > button > span > span")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#qty")).clear();
        driver.findElement(By.cssSelector("#qty")).sendKeys("2");
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();

//        driver.quit();


    }


}
