package practica.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import practicaCompra.questions.CompraRealizada;
import practicaCompra.tasks.LoggedInApp;
import practicaCompra.tasks.MakesBuy;
import practicaCompra.tasks.MakesBuys;
import practicaCompra.tasks.OpenTheBrowser;
import practicaCompra.userInterfaces.HomePage;
import practicaCompra.userInterfaces.PaginaSummaryShoppingPage;
import practicaCompra.utils.Constant;

public class RealizarCompraDeUnProductoStepDefinitions {

    HomePage homepage;

    @Managed()
    public WebDriver hisBrowser;

    private Actor david = Actor.named("David");

    @Before
    public void setUp() {
        david.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^david logged en app whith \"([^\"]*)\" and \"([^\"]*)\"$")
    public void davidLoggedEnAppWhithAnd(String user, String pass) throws Exception {
        david.wasAbleTo(OpenTheBrowser.on(homepage));
        david.wasAbleTo(LoggedInApp.Whith(user, pass));
    }

    @When("^makes a buy$")
    public void makesABuy() throws Exception {
        david.attemptsTo(MakesBuy.producto(hisBrowser));
    }

    @Then("^david see the purchase done\\.$")
    public void davidSeeThePurchaseDone() throws Exception {
        // david.should(seeThat(CompraRealizada.value(Constant.MSG_BUY_MADE_CORRECT),
        // hasItems("Your order on My Store is complete.")));
        david.should(seeThat("Mensaje de confirmación de compra", CompraRealizada.value(PaginaSummaryShoppingPage.MSG_PURCHASE_MADE),
                equalTo(Constant.MSG_BUY_MADE_CORRECT)));
    }

    @Given("^david logged whith \"([^\"]*)\" and \"([^\"]*)\"$")
    public void davidLoggedWhithAnd(String user, String pass) throws Exception {
        david.wasAbleTo(OpenTheBrowser.on(homepage));
        david.wasAbleTo(LoggedInApp.Whith(user, pass));
    }

    @When("^david makes buy the:$")
    public void davidMakesBuyTheFadedShortSleeveTShirtsBlouse(List<Map<String, String>> product) throws Exception {
        david.attemptsTo(MakesBuys.productos(hisBrowser));
        System.out.println("productos for buy" + product);
    }

    @Then("^should see the values the: \"([^\"]*)\"$")
    public void shouldSeeTheValuesThe(String arg1) throws Exception {
        david.should(seeThat("Valor a pagar por la compra", CompraRealizada.value(PaginaSummaryShoppingPage.MSG_VALUE_BUY), equalTo(Constant.MSG_BUY_CORRECT)));
    }
}
