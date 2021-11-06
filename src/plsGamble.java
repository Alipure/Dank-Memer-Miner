import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class plsGamble {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\School\\Spring Semester\\CSC 220\\selenium links and downloads\\browserdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://discord.com/login");
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(20);
        driver.get("https://discord.com/channels/546901601529495572/793277320458010685");
        TimeUnit.SECONDS.sleep(10);
        WebElement findtextBox = driver.findElementByXPath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/main/form/div/div/div/div/div/div[3]/div[2]");
        int numtimesExecuted = 0;
        while (true) {
            int gambleValue = 1000;
            int random = (int) (Math.random() * 7 + 9);
            findtextBox.sendKeys("pls slots " + gambleValue);
            findtextBox.sendKeys(Keys.ENTER);
            System.out.println("███████████████████████████████████");
            System.out.println("Slots sent!");
            numtimesExecuted++;
            System.out.println("Number of times ran: " + numtimesExecuted + "\n");
            System.out.println("Waiting for " + random + " seconds.\n");
            TimeUnit.SECONDS.sleep(random);
            findtextBox.sendKeys("pls gamble " + gambleValue);
            findtextBox.sendKeys(Keys.ENTER);
            System.out.println("███████████████████████████████████");
            System.out.println("Gamble sent");
            numtimesExecuted++;
            System.out.println("Number of times ran: " + numtimesExecuted + "\n");
            random = (int) (Math.random() * 7 + 9);
            System.out.println("Waiting for " + random + " seconds.\n");
            TimeUnit.SECONDS.sleep(random);
            findtextBox.sendKeys("pls highlow " + gambleValue);
            findtextBox.sendKeys(Keys.ENTER);
            TimeUnit.SECONDS.sleep(5);
            System.out.println("███████████████████████████████████");
            System.out.println("The number inserted is: " + random);
            if (12 >= random) {
                findtextBox.sendKeys("high");
                findtextBox.sendKeys(Keys.ENTER);
            } else {
                findtextBox.sendKeys("low");
                findtextBox.sendKeys(Keys.ENTER);
            }
            System.out.println("High and Low Sent!");
            numtimesExecuted++;
            System.out.println("Number of times ran: " + numtimesExecuted + "\n");
            random = (int) (Math.random() * 7 + 9);
            System.out.println("Waiting for " + random + " seconds.\n");
            TimeUnit.SECONDS.sleep(random);
        }
        /*
        WebElement cartButton = driver.findElementByClassName("btn-primary");
        cartButton.click();
         */
    }
}