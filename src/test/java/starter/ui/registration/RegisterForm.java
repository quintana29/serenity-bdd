package starter.ui.registration;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {
    public static Target INPUT_NAME = Target.the("Input name").locatedBy("//input[@id='name']");
    public static Target INPUT_LAST_NAME = Target.the("Input last name").locatedBy("//input[@id='last-name']");
    public static Target AGE = Target.the("Input age").locatedBy("//input[@id='age']");
    public static Target SELECT_COUNTRY = Target.the("Select country").locatedBy("//select[@id='country']");
    public static Target INPUT_EMAIL = Target.the("Input email").locatedBy("//input[@type='email']");
    public static Target INPUT_SEX = Target.the("Input sex").locatedBy("//input[@id='sex-m']");
    public static Target INPUT_DAY = Target.the("Input day").locatedBy("//input[@id='monday']");
    public static Target BTN_SAVE = Target.the("btn save").locatedBy("//button[@id='save-btn']");
    public static Target INPUT_PICTURE = Target.the("btn save").locatedBy("//input[@id='picture']");
    public static Target ALERT_ALL_REQUIRED_FIELDS = Target.the("Required fields alert")
            .locatedBy("//div[@role='alert']");


}
