package practicaCompra.userInterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://automationpractice.com/")
public class HomePage extends PageObject{
	
	public static final Target BTN_SING_IN = Target.the("Login botton").locatedBy("//a[@class='login']");
	public static final Target TXT_USER =Target.the("Field user").located(By.id("email"));
	public static final Target TXT_PASS =Target.the("Field pass").located(By.id("passwd"));
	public static final Target BTN_LOGIN =Target.the("Field pass").located(By.id("SubmitLogin"));
	
	
	
      
}
