package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.RegisterPage;

import java.time.Duration;

public class SD01_RegisterPageStepDef {
    public WebDriver ddriver;
    public RegisterPage registerPage;

    @When("the user enter all valid data")
    public void ValidData(){
        registerPage.RegisterStep();
    }

    @Then("the registration process should done successfully")
    public void SuccessProcess(){
ddriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assert.assertEquals("Your registration completed",ddriver.findElement(registerPage.TheRegistrationMess()).getText());
    }

//    @Before
//    public void OpenBrowser() throws InterruptedException {
//        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",path);
//
//        ddriver=new ChromeDriver();
//        ddriver.manage().window().maximize();
//        //this is an import point
//        registerPage =new RegisterPage(ddriver);
//
//
//        ddriver.navigate().to("https://demo.nopcommerce.com/");
//        //Thread.sleep(4000);
//
//
//    }
//
//    @After
//    public void CloseBrowser(){
//        ddriver.quit();
//    }
}
