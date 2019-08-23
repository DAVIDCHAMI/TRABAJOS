package practicaCompra.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import practicaCompra.interactions.DoScroll;
import practicaCompra.interactions.SelectBotton;
import practicaCompra.userInterfaces.PaginaSummaryShoppingPage;

public class ConfirmOrder implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(DoScroll.to(PaginaSummaryShoppingPage.BTN_CONFIRM_ORDER),
                SelectBotton.whit(PaginaSummaryShoppingPage.BTN_CONFIRM_ORDER),
                DoScroll.to(PaginaSummaryShoppingPage.MSG_PURCHASE_MADE));


        //actor.attemptsTo(Scroll.to(PaginaSummaryShoppingPage.BTN_CONFIRM_ORDER),Click.on(PaginaSummaryShoppingPage.BTN_CONFIRM_ORDER));
        //actor.attemptsTo(Scroll.to(PaginaSummaryShoppingPage.MSG_PURCHASE_MADE));
    }

    public static ConfirmOrder whithSummary() {
        return instrumented(ConfirmOrder.class);
    }

}
