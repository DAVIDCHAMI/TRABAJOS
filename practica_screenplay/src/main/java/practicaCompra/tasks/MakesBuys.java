package practicaCompra.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import practicaCompra.interactions.DoScroll;
import practicaCompra.interactions.SelectBotton;
import practicaCompra.userInterfaces.PaginaPrincipalPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakesBuys implements Task {

    WebDriver hisBrowser;

    public MakesBuys(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SelectBotton.whit(PaginaPrincipalPage.BTN_WOMEN),
                DoScroll.to(PaginaPrincipalPage.IMG_SHIRTS));
       // actor.attemptsTo(Scroll.to(PaginaPrincipalPage.IMG_SHIRTS));
        ((JavascriptExecutor) hisBrowser).executeScript("arguments[0].click()", hisBrowser.findElement(By.xpath(PaginaPrincipalPage.ADD_SHIRTS_CART_WEB_ELEMENT)));
        actor.attemptsTo(SelectBotton.whit(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT),
                SelectBotton.whit(PaginaPrincipalPage.CONTINUE_SHOPPING));
        ((JavascriptExecutor) hisBrowser).executeScript("arguments[0].click()", hisBrowser.findElement(By.xpath(PaginaPrincipalPage.ADD_ADD_SHIRTS_CART_WEB_ELEMENT_BLUSA)));

        actor.attemptsTo(DoScroll.to(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT),
                SelectBotton.whit(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT));
        actor.attemptsTo(Confirm.shoppingCartSummary());
    }

    public static Performable productos(WebDriver hisBrowser) {

        return instrumented(MakesBuys.class, hisBrowser);
    }

}
