import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class plsDo2 {
    public static void main(String[] args) throws InterruptedException {
        // Grab chrome driver
        System.setProperty("webdriver.chrome.driver", "D:\\School\\Programming\\CSC 220\\selenium links and downloads\\browserdrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        // Head to login
        driver.get("https://discord.com/login");
        // Full screen window
        driver.manage().window().maximize();
        // Element variable that finds email input box
        WebElement findEmail = driver.findElementByXPath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/div[1]/div/div[2]/input");
        // Enters the Email
        findEmail.sendKeys("");
        // Element variable that finds password input box
        WebElement findPassword = driver.findElementByXPath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/div[2]/div/input");
        // Enters the password
        findPassword.sendKeys("");
        // Clicks login
        driver.findElementByXPath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/button[2]").click();
        // Wait in seconds
        TimeUnit.SECONDS.sleep(5);
        // Head over to the desired channel
        driver.get("https://discord.com/channels/767086809066373160/769313479097188352");
        // Wait in seconds
        TimeUnit.SECONDS.sleep(10);
        WebElement findTextBox = driver.findElementByXPath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/main/form/div[1]/div/div/div[1]/div/div[3]/div[2]");

        // An int variable to indicate how many times a command ran
        int numTimesExecuted = 0;
        // An int variable that is a number between 0 and 4
        int inBetween;

        // Start time
        long startTime = System.currentTimeMillis();
        // Desired time for us to stop
        long desiredTime = 10800000;
        // Loops constantly when true
        while (true) {
            // Grab the current time
            long currentTime = System.currentTimeMillis() - startTime;
            // Converting current time to hour time
            double currentHourTime = (double) currentTime / 3600000;
            // Cool down with at least 43 seconds
            double random = (Math.random() * 100 + 43);
            int randomNew = (int) (random);
            System.out.println("███████████████████████████████████");
            System.out.println("[Waiting for " + randomNew + " seconds for cooldown.]");
            System.out.println("███████████████████████████████████");
            TimeUnit.SECONDS.sleep(randomNew);

            // pls hunt
            System.out.println("The bot will now hunt!");
            findTextBox.sendKeys("pls hunt");
            findTextBox.sendKeys(Keys.ENTER);
            inBetween = (int) (Math.random() * 6);
            System.out.println("[Waiting for " + inBetween + " seconds.]");
            System.out.println("███████████████████████████████████");
            TimeUnit.SECONDS.sleep(inBetween);
            numTimesExecuted++;

            // pls dig
            System.out.println("The bot will now dig!");
            findTextBox.sendKeys("pls dig");
            findTextBox.sendKeys(Keys.ENTER);
            inBetween = (int) (Math.random() * 6);
            System.out.println("[Waiting for " + inBetween + " seconds.]");
            System.out.println("███████████████████████████████████");
            TimeUnit.SECONDS.sleep(inBetween);
            numTimesExecuted++;

            // pls fish
            System.out.println("The bot will now fish!");
            findTextBox.sendKeys("pls fish");
            findTextBox.sendKeys(Keys.ENTER);
            inBetween = (int) (Math.random() * 6);
            System.out.println("[Waiting for " + inBetween + " seconds.]");
            System.out.println("███████████████████████████████████");
            TimeUnit.SECONDS.sleep(inBetween);
            numTimesExecuted++;
            System.out.println("The bot ran a total commands of " + numTimesExecuted + " times.");
            System.out.println("This program has been running for " + currentHourTime + " hours. \n");


            // If the time passes the desired time the loop will break
            /*if (currentTime >= desiredTime) {
                break;
            }

             */
        }

    }
}
