package StepDefinitions;

import Repository.BoardRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinitions.Config.driver;

public class Board {

    //USER CREATES A NEW LIST
    @Given("User clicks Board menu")
    public void userClicksBoardMenu() throws InterruptedException{
        Thread.sleep(6000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickBoardBtn();
    }

    @When("User clicks Add List button")
    public void userClicksAddListButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickAddListBtn();
    }

    @And("User inputs list name {string}")
    public void userInputsListName(String listWebAuto) throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.inputListName(listWebAuto);
    }

    @And("User clicks Create button")
    public void userClicksCreateButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickCreateBtn();
    }

    @Then("A new list will be created")
    public void aNewListWillBeCreated() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.verifyCreatingListSuccess();
    }

    //USER CREATES A NEW PRIVATE CARD
    @When("User clicks Add Card on List Web Automation")
    public void userClicksAddCardOnListWebAutomation() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickAddCardBtn1();
    }

    @And("User inputs Card name {string}")
    public void userInputsCardName(String cardWebAuto) throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.inputCardName(cardWebAuto);
    }

    @And("User clicks Private Card button")
    public void userClicksPrivateCardButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickPrivateCard();
    }

    @And("User clicks Add Card button")
    public void userClicksAddCardButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickAddCardBtn2();
    }

    @Then("A new private card will be created")
    public void aNewPrivateCardWillBeCreated() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.verifyCreatingCardSuccess();
    }

    //USER CHANGES THE PRIVATE CARD TO PUBLIC
    @When("User clicks Edit Card Menu button")
    public void userClicksEditCardMenuButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickEditCardMenuBtn();
    }

    @And("User clicks Public Card button")
    public void userClicksPublicCardButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickPublicCardBtn();
    }

    @Then("the private card will be changed to public")
    public void thePrivateCardWillBeChangedToPublic() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.verifyUpdateCardSuccess();
    }

    //USER CHANGES DUE DATE AND TIME
    @When("User clicks Card Web Automation")
    public void userClicksCardWebAutomation() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickCardWebAutoBtn();

    }

    @And("User clicks Due Date button")
    public void userClicksDueDateButton() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickDueDateBtn();
    }

    @And("User clicks calendar icon")
    public void userClicksCalendarIcon() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickCalendarIcon();
    }

    @And("User clicks date button")
    public void userClicksDateButton() throws InterruptedException{
        Thread.sleep(6000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickDateBtn();
    }

    @And("User changes the due time")
    public void userChangesTheDueTime() throws InterruptedException{
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickDueTime();
        BrRepo.ctrlaDueTime();
        BrRepo.backspaceDueTime();
        BrRepo.inputDueTime();
    }

    @And("User clicks Save button")
    public void userClicksSaveButton() throws InterruptedException{
        Thread.sleep(6000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickSaveBtn();
    }

    @Then("due date and time will successfully changed")
    public void dueDateAndTimeWillSuccessfullyChanged() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.verifyUpdateCardSuccess2();
    }

    //USER SETS LIST AS COMPLETE
    @When("User clicks three dots button on List Web Automation")
    public void userClicksThreeDotsButtonOnListWebAutomation() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickThreeDotsBtn();
    }

    @And("User clicks Set as a Complete List menu")
    public void userClicksSetAsACompleteListMenu() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.clickSetCompleteListBtn();
    }

    @Then("The list will be set as complete")
    public void theListWillBeSetAsComplete() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.verifyTextSetCompleteList();
    }

    //USER CREATES A NEW LIST WITHOUT LIST NAME
    @Then("User will fail to create a new list")
    public void userWillFailToCreateANewList() throws InterruptedException{
        Thread.sleep(3000);
        BoardRepo BrRepo = new BoardRepo(driver);
        BrRepo.verifyCreateListFailed();
    }
}
