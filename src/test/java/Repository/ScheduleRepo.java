package Repository;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Config.driver;

public class ScheduleRepo {

    public ScheduleRepo(WebDriver driver) {PageFactory.initElements(driver, this);}
    WebDriverWait wait = new WebDriverWait(driver, 10, 10);

    //USER CREATES A NEW EVENT WITH DEFAULT DATE AND TIME
    @FindBy(xpath ="//*[contains(text(), 'Schedule')]")
    public WebElement scheduleBtn;
    public void clickScheduleBtn() {
        WebElement clickSch = wait.until(ExpectedConditions.visibilityOf(scheduleBtn));
        clickSch.click();
    }

    @FindBy(xpath ="//div[@class='GlobalActionButton_container__EJ7Lh']")
    public WebElement createEventBtn;
    public void clickCreateEventBtn() {createEventBtn.click();}

    @FindBy(xpath ="//input[@placeholder='Type your event title...']")
    public WebElement eventTitle;
    public void inputEventTitle (String eventWebAuto) {eventTitle.sendKeys(eventWebAuto);}

    @FindBy(xpath ="//div[@class='fr-element fr-view']")
    public WebElement eventNotes;
    public void inputEventNotes (String notesWebAuto) {eventNotes.sendKeys(notesWebAuto);}

    @FindBy(xpath ="//*[contains(text(), 'Post Event')]")
    public WebElement postEventBtn;
    public void clickPostEventBtn() {postEventBtn.click();}

    @FindBy(xpath ="//div[@id='notistack-snackbar']")
    public WebElement textCreateEventSuccessful;
    public void verifyTextCreateEventSuccessful() {
        Assert.assertEquals("Create event successful", textCreateEventSuccessful.getText());
    }

    //USER CREATES A NEW EVENT WITHOUT TITLE
    @FindBy(xpath ="//div[@id='notistack-snackbar']")
    public WebElement createEventFailed;
    public void verifyCreateEventFailed() {
        Assert.assertEquals("Event title cannot be empty", createEventFailed.getText());
    }

}
