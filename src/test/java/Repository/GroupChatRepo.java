package Repository;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.Config.driver;

public class GroupChatRepo {
    public GroupChatRepo(WebDriver driver) {PageFactory.initElements(driver, this);}
    WebDriverWait wait = new WebDriverWait(driver, 10, 10);

    //USER SENDS AN ALPHABETS ONLY MESSAGE
    @FindBy(xpath ="//*[contains(text(),'Group Chat')]")
    public WebElement groupChatBtn;
    public void clickGroupChatBtn() {
        WebElement clickGC = wait.until(ExpectedConditions.visibilityOf(groupChatBtn));
        clickGC.click();
    }

    @FindBy(xpath ="//div[@class='fr-wrapper show-placeholder']/div")
    public WebElement chatTextField;
    public void clickChatTextField() {
        WebElement clickCTF = wait.until(ExpectedConditions.visibilityOf(chatTextField));
        clickCTF.click();
    }
    public void typeChatTextField(String alphabetsOnly) {chatTextField.sendKeys(alphabetsOnly);}

    @FindBy(xpath ="//div[@class='CreateMessage_send__2f1ZQ']")
    public WebElement sendChatBtn;
    public void clickSendChatBtn() {sendChatBtn.click();}

    @FindBy(xpath ="//*[contains(text(),'asdfghj')]")
    public WebElement alphabetsOnlyChat;
    public void verifyAlphabetsOnlyChat() {
        Assert.assertEquals("asdfghj",alphabetsOnlyChat.getText());
    }

    //USER SENDS A NUMBERS ONLY MESSAGE
    @FindBy(xpath ="//*[contains(text(),'1234567')]")
    public WebElement numbersOnlyChat;
    public void verifyNumbersOnlyChat() {
        Assert.assertEquals("1234567", numbersOnlyChat.getText());
    }

    //USER MENTIONS A MEMBER
    @FindBy(xpath ="//li[@class='highlight']")
    public WebElement gcMember;
    public void clickGCMember() {gcMember.click();}

    @FindBy(xpath ="//*[contains(text(),'Lulu Q.A.')]")
    public WebElement mentioningMemberChat;
    public void verifyMentioningMemberChat() {
        Assert.assertEquals("Lulu Q.A.", mentioningMemberChat.getText());
    }

    //USER SENDS A FILE
    @FindBy(xpath ="//div[@class='AttachFileContainer_container__3U9Wh']")
    public WebElement attachBtn;

    @FindBy(xpath ="//input[@multiple]")
    public WebElement attachBtn2;
    public void chooseFile() {attachBtn2.sendKeys("C:\\Users\\luluq\\IdeaProjects\\BigProject-WebAutomation\\gmail-icon.png");}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement sendFileSuccessful;
    public void verifySendFileSuccessful() {
        Assert.assertEquals("Upload attachments is success", sendFileSuccessful.getText());
    }

    //USER DELETES A MESSAGE
    @FindBy(xpath ="//*[contains(text(), '1234567')]")
    public WebElement hoverMessage;

    @FindBy(css =".Message_container__3maDl:nth-child(3) [data-testid='ExpandMoreOutlinedIcon']")
    public WebElement menuMessage;
    public void clickMenuMessage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverMessage).perform();
        menuMessage.click();
    }
    @FindBy(css ="div[class='MessageMenuPopUp_menu__1rkRG']")
    public WebElement deleteMsgBtn;
    public void clickDeleteMsgBtn() {deleteMsgBtn.click();}

    @FindBy(css ="div[class='Button_container__1WNuB']")
    public WebElement deleteMsgPopup;
    public void clickDeleteMsgPopup() {deleteMsgPopup.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement deleteMsgSuccessful;
    public void verifydeleteMsgSuccessful() {
        Assert.assertEquals("Delete group chat message success", deleteMsgSuccessful.getText());
    }

    //USER MENTIONS A NON MEMBER
    @FindBy(xpath ="//*[contains(text(),'No Match Found!')]")
    public WebElement noMatchFound;
    public void verifyNoMatchFound() {
        Assert.assertEquals("No Match Found!", noMatchFound.getText());
    }
}
