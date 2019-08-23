package practicaCompra.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectBotton implements Interaction {

    private Target target;

    public SelectBotton(Target target) {
        this.target = target;
    }

    public static Performable whit(Target btnSingIn) {
        return Tasks.instrumented(SelectBotton.class, btnSingIn);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }
}
