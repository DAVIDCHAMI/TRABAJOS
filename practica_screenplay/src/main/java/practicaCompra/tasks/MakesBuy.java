package practicaCompra.tasks;

import static  net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import practicaCompra.userInterfaces.PaginaPrincipalPage;

public class MakesBuy implements Task{
	
	WebDriver hisBrowser;
	
	

	public MakesBuy(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}

	@Override
	@Step("{0} start the buy")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaPrincipalPage.BTN_WOMEN));	
		
		actor.attemptsTo(Scroll.to(PaginaPrincipalPage.IMG_SHIRTS));
	   ((JavascriptExecutor)hisBrowser).executeScript("arguments[0].click()",hisBrowser.findElement(By.xpath(PaginaPrincipalPage.ADD_SHIRTS_CART_WEB_ELEMENT)));
	   
	   actor.attemptsTo(Scroll.to(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT),
			   Click.on(PaginaPrincipalPage.BTN_PROCCED_TO_CHECKOUT));
	  
	   actor.attemptsTo(Confirm.shoppingCartSummary()); 
	}
	
	
	

	public static MakesBuy producto(WebDriver hisBrowser) {
		return instrumented(MakesBuy.class, hisBrowser);
	}

	
	
	

}