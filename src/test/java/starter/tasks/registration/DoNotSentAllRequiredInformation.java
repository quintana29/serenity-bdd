package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.model.User;
import starter.ui.registration.RegisterForm;

public class DoNotSentAllRequiredInformation implements Task {

    private final User user;

    public DoNotSentAllRequiredInformation(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getName()).into(RegisterForm.INPUT_NAME),
                Enter.theValue(user.getLastName()).into(RegisterForm.INPUT_LAST_NAME),
                Click.on(RegisterForm.BTN_SAVE)
        );
    }
}
