package Repository;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.Config.driver;

public class BlastRepo {

    public BlastRepo(WebDriver driver) {PageFactory.initElements(driver, this);}
    WebDriverWait wait = new WebDriverWait(driver, 10, 10);

    //USER CREATES A NEW BLAST
    @FindBy(xpath ="//*[contains(text(), 'Blast!')]")
    public WebElement blastBtn;
    public void clickBlastBtn() {
        WebElement clickBL = wait.until(ExpectedConditions.visibilityOf(blastBtn));
        clickBL.click();
    }

    @FindBy(xpath ="//div[@class='GlobalActionButton_container__EJ7Lh']")
    public WebElement createBlastBtn;
    public void clickCreateBlastBtn() {
        WebElement clickCBL = wait.until(ExpectedConditions.visibilityOf(createBlastBtn));
        clickCBL.click();
    }

    @FindBy(xpath ="//textarea[@placeholder='Type a title...']")
    public WebElement blastTitle;
    public void inputBlastTitle (String blastWebAuto) {blastTitle.sendKeys(blastWebAuto);}

    @FindBy(xpath ="//div[@class='fr-element fr-view']")
    public WebElement blastDesc;
    public void inputBlastDesc (String webAutoTesting) {blastDesc.sendKeys(webAutoTesting);}

    @FindBy(xpath ="//*[contains(text(), 'Publish')]")
    public WebElement publishBtn;
    public void clickPublishBtn() {publishBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement textCreatePostSuccessful;
    public void verifyCreatePostSuccessful() {
        Assert.assertEquals("Create post successful", textCreatePostSuccessful.getText());
    }

    //USER EDITS BLAST TITLE
    @FindBy(xpath ="//div[@class='Post_link__3u8eF']")
    public WebElement blastWebAuto;
    public void clickBlastWebAuto() {
        WebElement clickBLWA = wait.until(ExpectedConditions.visibilityOf(blastWebAuto));
        clickBLWA.click();
    }

    @FindBy(xpath ="//div[@class='More_container__2VGML']")
    public WebElement threeDotsBtn;
    public void clickThreeDotsBtn() {threeDotsBtn.click();}

    @FindBy(xpath ="//*[contains(text(), 'Edit')]")
    public WebElement editBtn;
    public void clickEditBtn() {editBtn.click();}

    @FindBy(css ="textarea[placeholder='Type a title...']")
    public WebElement editBlastTitle;
    public void clearBlastTitle() {editBlastTitle.clear();}
    public void inputEditBlastTitle (String editBlastTitle2) {editBlastTitle.sendKeys(editBlastTitle2);}

    @FindBy(xpath ="//*[contains(text(), 'Save Changes')]")
    public WebElement saveChangesBtn;
    public void clickSaveChangesBtn() {saveChangesBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement editBlastTitleSuccessful;
    public void verifyEditBlastTitleSuccessful() {
        Assert.assertEquals("Update post successful", editBlastTitleSuccessful.getText());
    }

    //USER EDITS BLAST DESCRIPTION
    @FindBy(css ="div[class='fr-element fr-view']")
    public WebElement editBlastDesc;
    public void clearBlastDesc() {editBlastDesc.clear();}
    public void inputEditBlastDesc(String editBlastDesc2) {editBlastDesc.sendKeys(editBlastDesc2);}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement editBlastDescSuccessful;
    public void verifyEditBlastDescSuccessful() {
        Assert.assertEquals("Update post successful", editBlastDescSuccessful.getText());
    }

    //USER GIVES A CHEER ON THE BLAST POST
    @FindBy(css ="div[class='CheersButton_container__3mdsQ']")
    public WebElement cheersBtn;
    public void clickCheersBtn() {cheersBtn.click();}

    @FindBy(css ="input[class='form-control']")
    public WebElement textCheersBtn;
    public void inputTextCheersBtn(String textCheersBtn2) {textCheersBtn.sendKeys(textCheersBtn2);}

    @FindBy(css ="svg[data-testid='InsertEmoticonIcon']")
    public WebElement emoticonIcon;
    public void clickEmoticonIcon() {emoticonIcon.click();}

    @FindBy(xpath ="//ul[2]//li[8]//button[1]//img[1]")
    public WebElement smileyEmoticon;
    public void clickSmileyEmoticon() {
        WebElement clickSmiley = wait.until(ExpectedConditions.visibilityOf(smileyEmoticon));
        clickSmiley.click();
    }

    @FindBy(css ="svg[data-testid='CheckCircleOutlineIcon']")
    public WebElement checklistIcon;
    public void clickChecklistIcon() {checklistIcon.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement createCheersSuccessful;
    public void verifyCreateCheersSuccessful() {
        Assert.assertEquals("Create cheers on post successful", createCheersSuccessful.getText());
    }

    //USER INSERTS A FILE ON BLAST COMMENT SECTION
    @FindBy(css ="input[placeholder='Add new comment...']")
    public WebElement addBlastCommentBtn;
    public void clickAddBlastComment() {addBlastCommentBtn.click();}

    @FindBy(css ="button[id='insertFiles-1']")
    public WebElement insertFilesBtn;
    public void clickInsertFilesBtn() {insertFilesBtn.click();}

    @FindBy(css ="input[type='file']")
    public WebElement browseFile;
    public void inputBrowseFile() {
        browseFile.sendKeys("C:\\Users\\luluq\\IdeaProjects\\BigProject-WebAutomation\\gmail-icon.png");
    }

    @FindBy(css ="input[name='target']")
    public WebElement checklistFile;
    public void clickChecklistFile() {checklistFile.click();}

    @FindBy(css ="button[id='fr-file-insert-button-0']")
    public WebElement insertFile;
    public void clickInsertFile() {insertFile.click();}

    @FindBy(xpath ="//*[contains(text(), 'Post')]")
    public WebElement postCommentBtn;
    public void clickPostCommentBtn() {postCommentBtn.click();}

    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement createCommentBlastSuccessful;
    public void verifyCreateCommentBlastSuccessful() {
        Assert.assertEquals("Create comment on blast post successful", createCommentBlastSuccessful.getText());
    }

    //USER CREATES A NEW BLAST WITHOUT TITLE AND DESCRIPTION
    @FindBy(xpath ="//*[@id='notistack-snackbar']")
    public WebElement createBlastFailed;
    public void verifyCreateBlastFailed() {
        Assert.assertEquals("Field parameter not complete.", createBlastFailed.getText());
    }
}
