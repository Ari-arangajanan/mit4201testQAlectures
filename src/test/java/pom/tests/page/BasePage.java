package pom.tests.page;import org.openqa.selenium.WebDriver;import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.PageFactory;public class BasePage{    protected WebDriver driver;    public BasePage(WebDriver driver) {        this.driver = driver;    }    public EbayHome loadUrl(String url) {        // load browser and load url        driver.get(url);        return PageFactory.initElements(driver, EbayHome.class);    }    public void scrollPage(int x, int y) {        Actions actions = new Actions(driver);        actions.scrollByAmount(x,y);        actions.perform();    }}