package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_A_Friend {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Object of Chrome Driver
        driver.get("https://demo.nopcommerce.com/"); //Command to go to given url address
        driver.manage().window().maximize(); //Command to maximise the window
        driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000024_apple-macbook-pro-13-inch_415.jpeg\"]")).click(); //Command to click on given link
        driver.findElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]")).click(); //Command to click on 'Email to friend' button
        driver.findElement(By.id("FriendEmail")).sendKeys("abc@gmail.com"); //Command to type email of friend
        driver.findElement(By.id("YourEmailAddress")).sendKeys("xyz@gmail.com");//Command to type my email address
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hi, ABC!"); //Command to write personal message in message box
        driver.findElement(By.xpath("//button[@name=\"send-email\"]")).click();//Command to click on send email button
        String errormsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul[1]/li[1]")).getText();
        System.out.println(errormsg);//printing error texts from the website
        driver.quit(); //Command to close the browser

    }
}
