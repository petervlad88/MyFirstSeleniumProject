import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    private WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();

    }
    @Test
    public void wishList(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

        WebElement addedToWishlist  = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li > span"));
        Assert.assertTrue(addedToWishlist.isDisplayed());
        Assert.assertEquals("Slim fit Dobby Oxford Shirt has been added to your wishlist. Click here to continue shopping.",addedToWishlist.getText());

    }
    @Test
     public void addToWishProductSpecificColor(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
         driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
         driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
         driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
         driver.findElement(By.cssSelector("#send2 > span > span")).click();
         driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();
         driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > a")).click();
         driver.findElement(By.cssSelector("#swatch20 > span.swatch-label > img")).click();
         driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

         WebElement productCode = driver.findElement(By.cssSelector("#item_875 > td.wishlist-cell1.customer-wishlist-item-info > div.wishlist-sku > span"));
         Assert.assertTrue(productCode.isDisplayed());

         WebElement quantityDisplayed = driver.findElement(By.cssSelector("#item_875 > td.wishlist-cell2.customer-wishlist-item-quantity > div > div > input"));
         Assert.assertTrue(quantityDisplayed.isDisplayed());




    }
    @Test

    public void addToCartFromWishL(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("peter_vlad88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("vlad88");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("td.wishlist-cell4.customer-wishlist-item-cart > div > button > span > span")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#qty")).clear();
        driver.findElement(By.cssSelector("#qty")).sendKeys("2");
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();

        WebElement colorFieldDisplayed = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-info > dl > dt:nth-child(1)"));
        Assert.assertTrue(colorFieldDisplayed.isDisplayed());

        WebElement productColor = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-info > dl > dd:nth-child(2)"));
        Assert.assertEquals("Blue",productColor.getText());



    }    @After
    public void close(){
        driver.close();
    }


}
