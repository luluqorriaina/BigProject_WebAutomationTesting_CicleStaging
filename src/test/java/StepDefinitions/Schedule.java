package StepDefinitions;

import Repository.ScheduleRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinitions.Config.driver;

public class Schedule {

    //USER CREATES A NEW EVENT WITH DEFAULT DATE AND TIME
    @Given("User clicks Schedule menu")
    public void userClicksScheduleMenu() throws InterruptedException{
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.clickScheduleBtn();
    }

    @When("User clicks Create Event button")
    public void userClicksCreateEventButton() throws InterruptedException{
        Thread.sleep(3000);
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.clickCreateEventBtn();
    }

    @And("User inputs Event title {string}")
    public void userInputsEventTitle(String eventWebAuto) throws InterruptedException{
        Thread.sleep(3000);
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.inputEventTitle(eventWebAuto);
    }

    @And("User inputs notes {string}")
    public void userInputsNotes(String notesWebAuto) throws InterruptedException{
        Thread.sleep(3000);
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.inputEventNotes(notesWebAuto);
    }

    @And("User clicks Post Event button")
    public void userClicksPostEventButton() throws InterruptedException{
        Thread.sleep(3000);
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.clickPostEventBtn();
    }

    @Then("A new Event will be created")
    public void aNewEventWillBeCreated() throws InterruptedException{
        Thread.sleep(5000);
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.verifyTextCreateEventSuccessful();
    }

    //USER CREATES A NEW EVENT WITHOUT TITLE
    @Then("User will fail to create a new Event")
    public void userWillFailToCreateANewEvent() throws InterruptedException{
        Thread.sleep(3000);
        ScheduleRepo SchRepo = new ScheduleRepo(driver);
        SchRepo.verifyCreateEventFailed();
    }
}
