package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class News_Comment {
    public static WebDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Object of chrome driver
        String timestamp = new SimpleDateFormat("ddHHmmss").format(new java.util.Date()); //Stored object in string

        driver.get("https://demo.nopcommerce.com"); //Command to go to given url address
        driver.manage().window().maximize();//Command to maximise the window
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/a[@href=\"/nopcommerce-new-release\"]")).click();//Click on details under nopcommerce new release
        driver.findElement(By.className("enter-comment-title")).sendKeys("Satisfied");//Command to type title
        driver.findElement(By.className("enter-comment-text")).sendKeys("Your news seems accurate always."); //Command to type the comment
        driver.findElement(By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]")).click();//Command to click on the 'new comment' button
        String message = driver.findElement(By.className("result")).getText();//Created variable to print the text from the website
        System.out.println(message);//print out the message
        driver.quit();//Closing the browser

    }
}
