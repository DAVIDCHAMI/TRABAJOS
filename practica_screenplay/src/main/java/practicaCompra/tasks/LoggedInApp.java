package practicaCompra.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import practicaCompra.userInterfaces.HomePage;

import  static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoggedInApp implements Task{
	
	private String user;
	private String pass;

	
	public LoggedInApp(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	@Override
	@Step("{0} log in app")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_SING_IN));
		actor.attemptsTo(Scroll.to(HomePage.TXT_PASS));
		actor.attemptsTo(Enter.theValue(user).into(HomePage.TXT_USER),Enter.theValue(pass).into(HomePage.TXT_PASS),Click.on(HomePage.BTN_LOGIN));
		
	}

	public static Performable Whith(String user, String pass) {
		return instrumented(LoggedInApp.class, user, pass);
	}
	
	

}
