package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Object created for Chrome Driver
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); //Stored Object in variable
        System.out.println(timestamp); //printing timestamp

        driver.manage().window().maximize();//Maximising window
        driver.get("https://demo.nopcommerce.com/"); //Command to go to given url
        driver.findElement(By.className("ico-register")).click(); //command to click on register button
        driver.findElement(By.id("FirstName")).sendKeys("Jaydeep"); //Command to type first name
        driver.findElement(By.id("LastName")).sendKeys("Paneliya"); //Command to type last name
        driver.findElement(By.id("Email")).sendKeys("jaydeep"+timestamp+"@gmail.com"); //Command to type email
        driver.findElement(By.id("Password")).sendKeys("Jaydeep123");//command to type password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Jaydeep123"); //Command to retype password
        driver.findElement(By.id("register-button")).click(); //Command to click on register button

        String regMsg = driver.findElement(By.className("result")).getText();//Command to get text after registration is complete
        System.out.println(regMsg); //printing the above text
        driver.quit();

    }
}
