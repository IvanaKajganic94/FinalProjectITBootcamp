package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class ToolsQA_Base {
    public static WebDriver driver;
    public static WebDriverWait wdwait;
    public static Actions actions;
    public ToolsExcelReader toolsExcelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        toolsExcelReader = new ToolsExcelReader("C:\\Users\\Ivana\\Desktop\\TestData.xlsx");
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitForElementVisibility (WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementClickability (WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void uploadPicture(String source) throws IOException {
        URL imageURL = new URL(source);
        BufferedImage saveImage = ImageIO.read(imageURL);
        ImageIO.write(saveImage, "png", new File("C:\\Users\\Ivana\\Desktop\\meme.png"));
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
