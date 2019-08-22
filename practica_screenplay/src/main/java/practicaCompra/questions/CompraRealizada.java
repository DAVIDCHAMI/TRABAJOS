package practicaCompra.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import practicaCompra.userInterfaces.PaginaSummaryShoppingPage;

public class CompraRealizada{
	
	public static Question<String> value(Target msgPurchaseMade) {
		return actor ->Text.of(msgPurchaseMade).viewedBy(actor).asString();
	}

}
