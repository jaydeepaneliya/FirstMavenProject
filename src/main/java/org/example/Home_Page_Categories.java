package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page_Categories {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Object of Chrome driver
        driver.get("https://demo.nopcommerce.com/"); //Command to go on given url address
        driver.manage().window().maximize(); //Command to maximise the window
        String category1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[1]")).getText();//created variable
        System.out.println(category1);//print out the category
        String category2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a[1]")).getText();//created variable
        System.out.println(category2);//print out the category
        String category3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a[1]")).getText();//created variable
        System.out.println(category3);//print out the category
        String category4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]/a[1]")).getText();//created variable
        System.out.println(category4);//print out the category
        String category5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]/a[1]")).getText();//created variable
        System.out.println(category5);//print out the category
        String category6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]/a[1]")).getText();//created variable
        System.out.println(category6);//print out the category
        String category7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]/a[1]")).getText();//created variable
        System.out.println(category7);//print out the category
        driver.quit(); //Command to close the window











    }
}
