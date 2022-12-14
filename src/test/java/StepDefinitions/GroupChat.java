package StepDefinitions;

import Repository.GroupChatRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class GroupChat {

    public WebDriver driver;

    public GroupChat() {
        super();
        this.driver=Config.driver;
    }

    //USER SENDS ALPHABETS ONLY MESSAGE
    @Given("User clicks Group Chat menu")
    public void userClicksGroupChatMenu() throws InterruptedException{
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickGroupChatBtn();
    }

    @When("User clicks new message text field")
    public void userClicksNewMessageTextField() throws InterruptedException{
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickChatTextField();
    }

    @And("User types {string}")
    public void userTypes(String alphabetsOnly) throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.typeChatTextField(alphabetsOnly);
    }

    @And("User clicks send message button")
    public void userClicksSendMessageButton() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickSendChatBtn();
    }

    @Then("A new alphabets only message will be sent")
    public void aNewAlphabetsOnlyMessageWillBeSent() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.verifyAlphabetsOnlyChat();
    }

    //USER SENDS NUMBERS ONLY MESSAGE
    @Then("A new numbers only message will be sent")
    public void aNewNumbersOnlyMessageWillBeSent() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.verifyNumbersOnlyChat();
    }

    //USER MENTIONS A MEMBER
    @And("User chooses a member to be mentioned")
    public void userChoosesAMemberToBeMentioned() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickGCMember();
    }

    @Then("A new message mentioning a member will be sent")
    public void aNewMessageMentioningAMemberWillBeSent() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.verifyMentioningMemberChat();
    }

    //USER SENDS A FILE
    @When("User chooses a file to be sent")
    public void userChoosesAFileToBeSent() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.chooseFile();
    }

    @Then("A file will be sent")
    public void aFileWillBeSent() throws InterruptedException{
        Thread.sleep(2000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.verifySendFileSuccessful();
    }

    //USER DELETES A CHAT
    @When("User clicks Menu Message on a selected chat")
    public void userClicksMenuMessageOnASelectedChat() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickMenuMessage();
    }

    @And("User clicks Delete Message option")
    public void userClicksDeleteMessageOption() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickDeleteMsgBtn();
    }

    @And("User clicks Delete on the popup message")
    public void userClicksDelete() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.clickDeleteMsgPopup();
    }

    @Then("The selected message will be deleted")
    public void theSelectedChatWillBeDeleted() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
    }

    //USER MENTIONS A NON MEMBER
    @Then("User will fail to mention a non member of the Group Chat")
    public void userWillFailToMentionANonMemberOfTheGroupChat() throws InterruptedException{
        Thread.sleep(3000);
        GroupChatRepo GCRepo = new GroupChatRepo(driver);
        GCRepo.verifyNoMatchFound();
    }
}
