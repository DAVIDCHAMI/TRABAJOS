package practicaCompra.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class InsertIntoField implements Interaction {
    private String aux;
    private Target target;

    public InsertIntoField(String aux, Target target) {
        this.aux = aux;
        this.target = target;
    }

    public static Performable theValue(String aux, Target target) {
        return Tasks.instrumented(InsertIntoField.class, aux, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(aux).into(target));
    }
}
