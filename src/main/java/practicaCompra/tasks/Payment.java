package practicaCompra.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import practicaCompra.interactions.DoScroll;
import practicaCompra.interactions.SelectBotton;
import practicaCompra.userInterfaces.PaginaSummaryShoppingPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Payment implements Task {

    @Override
    @Step("{0} select  form the payment")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(DoScroll.to(PaginaSummaryShoppingPage.BTN_PAY_BY_CHECK),
                SelectBotton.whit(PaginaSummaryShoppingPage.BTN_PAY_BY_CHECK));


        //actor.attemptsTo(Scroll.to(PaginaSummaryShoppingPage.BTN_PAY_BY_CHECK),Click.on(PaginaSummaryShoppingPage.BTN_PAY_BY_CHECK));
        actor.attemptsTo(ConfirmOrder.whithSummary());
    }

    public static Performable payByCheck() {
        return instrumented(Payment.class);
    }


}
