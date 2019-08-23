package practicaCompra.tasks;

import  static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import practicaCompra.userInterfaces.PaginaSummaryShoppingPage;

public class Confirm implements Task{

	@Override
	@Step("{0} confirm the buy")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Scroll.to(PaginaSummaryShoppingPage.BTN_PROCEED_CHECKOUT),Click.on(PaginaSummaryShoppingPage.BTN_PROCEED_CHECKOUT),
				Scroll.to(PaginaSummaryShoppingPage.BTN_PROCEED_CHECKOUT_ADDRESSES),Click.on(PaginaSummaryShoppingPage.BTN_PROCEED_CHECKOUT_ADDRESSES),
				Scroll.to(PaginaSummaryShoppingPage.CHECK_TERMS),Click.on(PaginaSummaryShoppingPage.CHECK_TERMS),
				Click.on(PaginaSummaryShoppingPage.BTN_PROCEED_SHIPPING_));
		
		actor.attemptsTo(Payment.payByCheck());
	}

	public static Confirm shoppingCartSummary() {
	return	instrumented(Confirm.class);
	}

}
