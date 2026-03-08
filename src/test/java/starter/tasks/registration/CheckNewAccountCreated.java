package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.model.User;

import static starter.ui.registration.SummaryPage.LABEL_LAST_NAME;
import static starter.ui.registration.SummaryPage.LABEL_NAME;

public class CheckNewAccountCreated implements Task {

    private final User user;

    public CheckNewAccountCreated(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
        Actor.attemptsTo(
                Switch.toWindowTitled("Summary"),
                Ensure.that(LABEL_NAME)
                        .text().containsIgnoringCase(user.getName()),
                Ensure.that(LABEL_LAST_NAME)
                        .text().containsIgnoringCase(user.getLastName())
              );


    }
}
