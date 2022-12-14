package StepDefinitions;

import Repository.BlastRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinitions.Config.driver;

public class Blast {

    //USER CREATES A NEW BLAST
    @Given("User clicks Blast menu")
    public void userClicksBlastMenu() throws InterruptedException {
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickBlastBtn();
    }

    @When("User clicks Create Blast button")
    public void userClicksCreateBlastButton() throws InterruptedException {
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickCreateBlastBtn();
    }

    @And("User inputs title {string}")
    public void userInputsTitle(String blastWebAuto) throws  InterruptedException {
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.inputBlastTitle(blastWebAuto);
    }

    @And("User inputs description {string}")
    public void userInputsDescription(String webAutoTesting) throws InterruptedException {
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.inputBlastDesc(webAutoTesting);
    }

    @And("User clicks Publish button")
    public void userClicksPublishButton() throws InterruptedException {
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickPublishBtn();
    }

    @Then("A new Blast will be created")
    public void aNewBlastWillBeCreated() throws InterruptedException {
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.verifyCreatePostSuccessful();
    }

    //USER EDITS BLAST TITLE
    @When("User clicks Blast Web Automation")
    public void userClicksBlastWebAutomation() throws InterruptedException{
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickBlastWebAuto();

    }

    @And("User clicks three dots button")
    public void userClicksThreeDotsButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickThreeDotsBtn();
    }

    @And("User clicks Edit button")
    public void userClicksEditButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickEditBtn();
    }

    @And("User edits Blast title to {string}")
    public void userEditsBlastTitleTo(String editBlastTitle2) throws InterruptedException{
        Thread.sleep(6000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clearBlastTitle();
        BlRepo.inputEditBlastTitle(editBlastTitle2);
    }

    @And("User clicks Save Changes button")
    public void userClicksSaveChangesButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickSaveChangesBtn();
    }

    @Then("The Blast title is successfully edited")
    public void theBlastTitleIsSuccessfullyEdited() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.verifyEditBlastTitleSuccessful();
    }

    //USER EDITS BLAST DESCRIPTION
    @And("User edits Blast description to {string}")
    public void userEditsBlastDescriptionTo(String editBlastDesc2) throws InterruptedException{
        Thread.sleep(6000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clearBlastDesc();
        BlRepo.inputEditBlastDesc(editBlastDesc2);
    }

    @Then("The Blast description is successfully edited")
    public void theBlastDescriptionIsSuccessfullyEdited() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.verifyEditBlastDescSuccessful();
    }

    //USER GIVES A CHEER ON THE BLAST POST
    @And("User clicks Give Cheers button")
    public void userClicksGiveCheersButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickCheersBtn();
    }

    @And("User inputs {string}")
    public void userInputs(String textCheersBtn2) throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.inputTextCheersBtn(textCheersBtn2);
    }

    @And("User clicks Emoticon icon")
    public void userClicksEmoticonIcon() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickEmoticonIcon();
    }

    @And("User clicks a smiley emoticon")
    public void userClicks() throws InterruptedException{
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickSmileyEmoticon();
    }

    @And("User clicks checklist icon")
    public void userClicksChecklistIcon() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickChecklistIcon();
    }

    @Then("a cheer is successfully given")
    public void aCheerIsSuccessfullyGiven() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.verifyCreateCheersSuccessful();
    }

    //USER INSERTS A FILE ON BLAST COMMENT SECTION
    @And("User clicks Add new comment button")
    public void userClicksAddNewCommentButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickAddBlastComment();
    }

    @And("User clicks Insert Files button")
    public void userClicksInsertFilesButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickInsertFilesBtn();
    }

    @And("User browses and picks a file")
    public void userBrowsesAndPicksAFile() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.inputBrowseFile();
    }

    @And("User checklists the file")
    public void userChecklistsTheFile() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickChecklistFile();
    }

    @And("User clicks Insert button")
    public void userClicksInsertButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickInsertFile();
    }

    @And("User clicks Post button")
    public void userClicksPostButton() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.clickPostCommentBtn();
    }

    @Then("A file is successfully inserted on Blast comment section")
    public void aFileIsSuccessfullyInsertedOnCommentSection() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.verifyCreateCommentBlastSuccessful();
    }

    //USER CREATES A NEW BLAST WITHOUT TITLE AND DESCRIPTION
    @Then("User will fail to create a new Blast")
    public void userWillFailToCreateANewBlast() throws InterruptedException{
        Thread.sleep(3000);
        BlastRepo BlRepo = new BlastRepo(driver);
        BlRepo.verifyCreateBlastFailed();
    }
}
