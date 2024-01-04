package com.upright.Utillity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    WebDriver driver;

    String myBrowser;

  //methods
  // initialize the browser
    //different browser has it own driver--chrome driver, firefox driver
    // iedriver, operadriver, safari, adgedriver

public void loadProperties() throws IOException {
    FileInputStream obj= new FileInputStream("C://Users//Nayma Khanam//IdeaProjects//NaymaBatch7//src//test//java//com//upright//Utillity//info.properties");
    Properties prop= new Properties();

    prop.load(obj);

     myBrowser= prop.getProperty("browser");
    System.out.println(myBrowser);

}

    public void launchBrowser() throws InterruptedException {

   System.setProperty("webdriver.chrome.driver","C:/Users/Nayma Khanam/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
   System.setProperty("webdriver.gecko.driver","C:/Users/Nayma Khanam/Documents/Downloads/geckodriver-v0.33.0-win64/geckodriver.exe");

  // driver=new ChromeDriver(); // open the chorme browser
        if(myBrowser.equals("chrome")){
            driver=new ChromeDriver();
        }
        else if (myBrowser.equals("firefox")) {
            driver=new FirefoxDriver();
        }
      else{
            System.out.println(" please check your driver");
        }
  // driver.get("https://uprightforum.tech/");// it will wait till driver get loaded

   driver.navigate().to("https://uprightforum.tech"); // ot won't wait till driver get load
        driver. navigate().to("https://www.naymakhanam.click/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        String myCurrentURL= driver.getCurrentUrl();
        System.out.println(myCurrentURL);

       String myTitle= driver.getTitle();
        System.out.println(myTitle);
        // domain and hosting
        // common interview questions..... what are the difference between driver.get() vs navigate ()

// driver.manage().window().maximize();
    }


    public static void main(String[] args) throws InterruptedException, IOException{
        BaseClass obj= new BaseClass();
        obj.loadProperties();
        obj.launchBrowser();

    }
}
