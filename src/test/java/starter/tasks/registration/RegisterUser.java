package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import starter.ui.registration.RegisterForm;
import starter.model.User;

import java.net.URISyntaxException;

public class RegisterUser implements Task {

    private final User user;
    public RegisterUser(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(user.getName()).into(RegisterForm.INPUT_NAME),
                    Enter.theValue(user.getLastName()).into(RegisterForm.INPUT_LAST_NAME),
                    Enter.theValue(user.getAge()).into(RegisterForm.AGE),
                    SelectFromOptions.byVisibleText(user.getCountry()).from(RegisterForm.SELECT_COUNTRY),
                    Click.on(RegisterForm.INPUT_SEX),
                    Enter.theValue(user.getEmail()).into(RegisterForm.INPUT_EMAIL),
                    Click.on(RegisterForm.INPUT_DAY),
                    Upload.theClasspathResource("pictures/images.jpg").to(RegisterForm.INPUT_PICTURE),
                    Click.on(RegisterForm.BTN_SAVE)
            );
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
