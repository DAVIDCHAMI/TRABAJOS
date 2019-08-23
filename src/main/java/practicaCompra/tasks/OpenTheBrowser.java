package practicaCompra.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import practicaCompra.userInterfaces.HomePage;

public class OpenTheBrowser implements Task {

    private PageObject homepage;

    public OpenTheBrowser(PageObject homepage) {
        this.homepage = homepage;
    }

    @Override
    @Step("{0} opens browser on page  automaticepractice")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homepage));

    }

    public static OpenTheBrowser on(HomePage homepage) {
        return instrumented(OpenTheBrowser.class, homepage);
    }


}
