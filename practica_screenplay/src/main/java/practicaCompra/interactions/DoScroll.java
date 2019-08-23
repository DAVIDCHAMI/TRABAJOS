package practicaCompra.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.targets.Target;

public class DoScroll implements Interaction {

    private Target target;

    public DoScroll(Target target) {
        this.target = target;
    }

    public static Performable to(Target target) {

        return Tasks.instrumented(DoScroll.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(target));
    }
}
