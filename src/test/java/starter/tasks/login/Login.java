package starter.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.model.LoginCredentials;
import starter.ui.login.LoginPage;

public class Login implements Task {

    private final LoginCredentials loginCredentials;

    public Login(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginCredentials.getUsername()).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(loginCredentials.getPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOG_IN)
        );

    }
}
