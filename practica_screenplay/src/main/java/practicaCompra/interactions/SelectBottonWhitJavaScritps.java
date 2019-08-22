package practicaCompra.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SelectBottonWhitJavaScritps implements Interaction {

    private WebElementFacade webElementFacade;

    public SelectBottonWhitJavaScritps(WebElementFacade webElementFacade) {
        this.webElementFacade = webElementFacade;
    }

    public static Performable in(WebElementFacade webElementFacade) {
        return Tasks.instrumented(SelectBottonWhitJavaScritps.class, webElementFacade);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].click()", webElementFacade);
    }
}
