package practicaCompra.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import practicaCompra.interactions.DoScroll;
import practicaCompra.interactions.SelectBotton;
import practicaCompra.interactions.SelectBottonWhitJavaScritps;
import practicaCompra.userInterfaces.PaginaPrincipalPage;

public class MakesBuy implements Task {

    WebDriver hisBrowser;


    public MakesBuy(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    @Step("{0} start the buy")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectBotton.whit(PaginaPrincipalPage.BTN_WOMEN), DoScroll.to(PaginaPrincipalPage.IMG_SHIRTS));
        //((JavascriptExecutor)hisBrowser).executeScript("arguments[0].click()",hisBrowser.findElement(By.xpath(PaginaPrincipalPage.ADD_SHIRTS_CART_WEB_ELEMENT)));
        WebElementFacade ADD_SHIRTS_CART = BrowseTheWeb.as(actor).findBy(PaginaPrincipalPage.ADD_SHIRTS_CART_WEB_ELEMENT);
        actor.attemptsTo(SelectBottonWhitJavaScritps.in(ADD_SHIRTS_CART),
                DoScroll.to(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT),
                SelectBotton.whit(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT));
        actor.attemptsTo(Confirm.shoppingCartSummary());
    }


    public static MakesBuy producto(WebDriver hisBrowser) {
        return instrumented(MakesBuy.class, hisBrowser);
    }


}
