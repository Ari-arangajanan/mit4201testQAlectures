package pom.tests.page;import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;import org.openqa.selenium.support.PageFactory;import pom.utility.TestNGUtil;public class PhoneResult extends BasePage {    @FindBy(xpath = "//span[text()='Apple']")    public WebElement checkBox;    public PhoneResult(WebDriver driver) {        super(driver);    }    public  void appleCheckBox(){        checkBox.click();    }}