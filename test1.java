import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/merve/Masaüstü/test/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/");

        WebElement kabulEtCookies = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        kabulEtCookies.click();

        WebElement giyimAksesuar = driver.findElement(By.xpath("//a[contains(@href, 'giyim-aksesuar')]"));
        giyimAksesuar.click();

        WebElement kadinIcGiyim = driver.findElement(By.linkText("Kadın İç Giyim"));
        kadinIcGiyim.click();

        WebElement corap = driver.findElement(By.xpath("(//a[contains(@href, '/giyim-aksesuar/dizalti-corap/')])[3]"));
        corap.click();


    }
}
