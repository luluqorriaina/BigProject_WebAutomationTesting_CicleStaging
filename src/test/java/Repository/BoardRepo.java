package Repository;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Config.driver;

public class BoardRepo {

    public BoardRepo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, 10, 10);

    //USER CREATES A NEW LIST
    @FindBy(xpath ="//*[contains(text(),'Board')]")
    public WebElement boardBtn;
    public void clickBoardBtn() {
        WebElement clickBoard = wait.until(ExpectedConditions.visibilityOf(boardBtn));
        clickBoard.click();
    }

    @FindBy(xpath ="//div[@class='Button_container__1WNuB Button_flexStart__2nS1S']")
    public WebElement addListBtn;
    public void clickAddListBtn() {
        WebElement clickAddList = wait.until(ExpectedConditions.visibilityOf(addListBtn));
        clickAddList.click();
    }

    @FindBy(xpath ="//input[@placeholder='Input list name...']")
    public WebElement listName;
    public void inputListName(String listWebAuto) {listName.sendKeys(listWebAuto);}

    @FindBy(xpath ="//div[@class='Button_container__1WNuB']")
    public WebElement createBtn;
    public void clickCreateBtn() {createBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement textCreatingListSuccess;
    public void verifyCreatingListSuccess() {
        Assert.assertEquals("Creating list is success", textCreatingListSuccess.getText());
    }

    //USER CREATES A NEW PRIVATE CARD
    @FindBy(xpath ="//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI']")
    public WebElement addCardBtn1;
    public void clickAddCardBtn1() {addCardBtn1.click();}

    @FindBy(xpath ="//input[@placeholder='Card name']")
    public WebElement cardName;
    public void inputCardName(String cardWebAuto) {cardName.sendKeys(cardWebAuto);}

    @FindBy(xpath ="//input[@type='checkbox']")
    public WebElement privateCard;
    public void clickPrivateCard() {privateCard.click();}

    @FindBy(xpath ="//div[@class='Button_container__1WNuB']")
    public WebElement addCardBtn2;
    public void clickAddCardBtn2() {addCardBtn2.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement textCreatingCardSuccess;
    public void verifyCreatingCardSuccess() {
        Assert.assertEquals("Creating card is success", textCreatingCardSuccess.getText());
    }

    //USER CHANGES THE PRIVATE CARD TO PUBLIC
    @FindBy(css ="div[id='editCardMenu']")
    public WebElement editCardMenuBtn;
    public void clickEditCardMenuBtn() {editCardMenuBtn.click();}

    @FindBy(css ="p[id='editCardMenuButton__ChangeAccess_text']")
    public WebElement publicCardBtn;
    public void clickPublicCardBtn() {publicCardBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement textUpdateCardSuccess;
    public void verifyUpdateCardSuccess() {
        Assert.assertEquals("Update card is success", textUpdateCardSuccess.getText());
    }

    //USER CHANGES DUE DATE AND TIME
    @FindBy(css ="a[class='ModalLinkNoDecor_ModalLink__1zSCj ModalLinkNoDecor_overlay__b-4ve']")
    public WebElement cardWebAutoBtn;
    public void clickCardWebAutoBtn() {cardWebAutoBtn.click();}

    @FindBy(css ="svg[data-testid='EventIcon']")
    public WebElement dueDateBtn;
    public void clickDueDateBtn() {dueDateBtn.click();}

    @FindBy(css ="svg[data-testid='CalendarIcon']")
    public WebElement calendarIcon;
    public void clickCalendarIcon() {calendarIcon.click();}

    @FindBy(css ="button[aria-label='Dec 12, 2022']")
    public WebElement dateBtn;
    public void clickDateBtn() {dateBtn.click();}

    @FindBy(id ="mui-4")
    public WebElement dueTime;
    public void clickDueTime() {
        WebElement clickDueTime = wait.until(ExpectedConditions.visibilityOf(dueTime));
    }
    public void ctrlaDueTime() {dueTime.sendKeys(Keys.chord(Keys.CONTROL,"a"));}
    public void backspaceDueTime() {dueTime.sendKeys(Keys.BACK_SPACE);}
    public void inputDueTime() {dueTime.sendKeys("12:12 PM");}

    @FindBy(css ="button[class='btn btn-success btn-sm']")
    public WebElement saveBtn;
    public void clickSaveBtn() {saveBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement textUpdateCardSuccess2;
    public void verifyUpdateCardSuccess2() {
        Assert.assertEquals("Update card is success", textUpdateCardSuccess2.getText());
    }

    //USER SETS LIST AS A COMPLETE LIST
    @FindBy(css ="svg[data-testid='MoreHorizIcon']")
    public WebElement threeDotsBtn;
    public void clickThreeDotsBtn() {threeDotsBtn.click();}

    @FindBy(css ="svg[data-testid='CheckCircleIcon']")
    public WebElement setCompleteListBtn;
    public void clickSetCompleteListBtn() {setCompleteListBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement textSetCompleteList;
    public void verifyTextSetCompleteList() {
        Assert.assertEquals("Set list as Complete is success", textSetCompleteList.getText());
    }

    //USER CREATES A NEW LIST WITHOUT LIST NAME
    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement createListFailed;
    public void verifyCreateListFailed() {
        Assert.assertEquals("List name cannot be empty", createListFailed.getText());
    }

}
